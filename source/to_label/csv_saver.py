import pandas as pd
import sys
import glob


def save_csv():
	looking_path = 'mosa/**/statistics.csv'
	files = glob.glob(looking_path, recursive=True)	
	frames = [pd.read_csv(x) for x in files]
	aggregate = pd.concat(frames)

	aggregate = aggregate.sort_values(by=['TARGET_CLASS'])
	print(aggregate.shape[0])
	aggregate = aggregate.dropna()
	aggregae = aggregate[aggregate['CoverageEntropy']!=0]
	print(aggregate.shape[0])
	aggregate.to_csv('mosa.csv', index=False)

	# aggregate = aggregate[aggregate['Total_Goals'] >= 5]
	# aggregate = aggregate.sort_values(by=['Total_Goals'], ascending=False)
	# selection = aggregate.head(1000)
	# selection.to_csv('rq1_subjects.csv', index=False)
	# print('More than 5 goals = {}'.format(aggregate.shape[0]))

	# subjects = pd.read_csv('subject_100.csv', names=['project', 'class'])
	# done_cl = aggregate['TARGET_CLASS'].unique().tolist()
	
	# aux = subjects[~subjects['class'].isin(done_cl)]

	# aux.to_csv('missing.txt', sep='\t', index=False, header=False)

def selection():
	smells = pd.read_csv('test-method-smells.csv')
	print(smells.shape[0])
	smells = smells[smells["test-method"].str.startswith("test")]
	print(smells.shape[0])
	smelly = smells[smells['isEagerTest'] == 1]
	print('Smelly = {}'.format(smelly.shape[0]))
	not_smelly = smells[smells['isEagerTest'] == 0]
	print('Not smelly = {}'.format(not_smelly.shape[0]))

	# sample = pd.concat([smelly.sample(336), not_smelly.sample(150)])
	sample = pd.concat([smelly.sample(336)])
	sample['path'] = sample['test-suite'].apply(lambda x: look_path(x))
	sample.to_csv('sample.csv', index=False)


def look_path(x):
	name = x.split('.')[-1]+'.java'
	f = glob.glob('mosa/**/{}'.format(name), recursive=True)
	assert(len(f) == 1)
	return f[0]

if __name__ == '__main__':
	selection()
