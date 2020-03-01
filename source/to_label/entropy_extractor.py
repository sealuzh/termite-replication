import pandas as pd
import sys
import glob
import re
import os

import numpy as np


def save_csv():
	smells = pd.read_csv('sample.csv')
	paths = smells['path'].unique().tolist()

	classes = []
	test_names = []
	entropies = []

	for f in paths:
		o = open(f, 'r')
		is_test = False
		for line in o.readlines():
			if line.strip().startswith('package'):
				package = re.search(r'package\s(.*?);',line.strip()).group(1)
				clazz = os.path.basename(f).replace('_ESTest.java', '')
				full_name = package+'.'+clazz
			if line.strip().startswith('@Test'):
				is_test = True
				continue
			if is_test:
				is_test = False
				test_name = re.search(r'void\s(.*?)\(',line.strip()).group(1)
				if test_name != "notGeneratedAnyTest":
					test_names.append(test_name)
			if line.strip().startswith('/*Coverage entropy='):
				entropy = re.search(r'entropy=(.*?)$',line.strip()).group(1)
				entropies.append(entropy)
				classes.append(full_name)
	res = pd.DataFrame({'production-class': classes, 'test-method': test_names, 'entropy': entropies}, 
		columns=['production-class', 'test-method', 'entropy'])
	res.to_csv('entropies.csv', index=False)
	
	


if __name__ == '__main__':
	save_csv()
