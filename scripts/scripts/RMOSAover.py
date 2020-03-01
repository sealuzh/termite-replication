#!/usr/bin/python
#
# Copyright (C) 2010-2016 Gordon Fraser, Andrea Arcuri and EvoSuite
# contributors
#
# This file is part of EvoSuite.
#
# EvoSuite is free software: you can redistribute it and/or modify it
# under the terms of the GNU Lesser General Public License as published
# by the Free Software Foundation, either version 3.0 of the License, or
# (at your option) any later version.
#
# EvoSuite is distributed in the hope that it will be useful, but
# WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
# Lesser Public License for more details.
#
# You should have received a copy of the GNU Lesser General Public
# License along with EvoSuite. If not, see <http://www.gnu.org/licenses/>.
#

# How to run EvoSuite
import os
import subprocess
import sys

HOME=os.getcwd()

EVOSUITE="/usr/bin/java -Xmx800M -jar \"" + HOME + "/evosuite.jar\""

# Loction of tab-separated file
CASESTUDY_DIR=HOME + "/projects/"
SOURCE_DIR = HOME + "/SF110/"

CONFIG_NAME = "RMOSA"

EXPERIMENT_NAME="EvoSuite"

STRATEGY = "-generateMOSuite"
ALGORITHM = "RMOSA"

FLAG = ' -Dslicing=true -Dranking_type=ENTROPY_SORTING -Dslicing_approach=TOP -Dslicing_cutoff=10'

def getScriptHead():
    s =  "#!/bin/bash\n"
    return s

#import experiments_base
execfile('experiments_overtime.py')
