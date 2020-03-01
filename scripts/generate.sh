#!/bin/bash
if [[ $OSTYPE == 'linux-gnu' ]]; then
	python_cmd='python'
else
	python_cmd='python2'
fi

if [ $# -eq 3 ] 
then
    echo 'Seed from ' $1 ' to ' $2 '- Threads = ' $3 
else
    echo "Invalid number of arguments"
    exit 1
fi

seed1=$1
seed2=$2
proc=$3

echo "For more than one version, separate the number with a comma"
echo "1 = MOSA"
echo "2 = Readable MOSA top, 10 cut off"
echo "3 = Readable MOSA top, delta 10 cut off"
echo "4 = QMOSA"
echo "5 = Readable MOSA top, delta 10 cut off with time"
echo "6 = MOSA over time"
echo "7 = QMOSA over time"
echo "8 = TERMITE over time"
read choice

rm -rf run.sh
echo '#!/bin/bash' >> run.sh
chmod 777 run.sh
for i in $(echo $choice | sed "s/,/ /g")
do
	if [ "$i" == "1" ]; then
		${python_cmd} scripts/MOSA.py mosa $seed1 $seed2 subjects.txt 1 $proc
		echo 'chmod 777 mosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './mosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "2" ]; then
		${python_cmd} scripts/RMOSA.py rmosa $seed1 $seed2 subjects.txt 1 $proc 	
		echo 'chmod 777 rmosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './rmosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "3" ]; then
		${python_cmd} scripts/RMOSA_delta.py rmosa_delta $seed1 $seed2 subjects.txt 1 $proc
		echo 'chmod 777 rmosa_delta/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './rmosa_delta/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "4" ]; then
		${python_cmd} scripts/QMOSA.py qmosa $seed1 $seed2 subjects.txt 1 $proc
		echo 'chmod 777 qmosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './qmosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "5" ]; then
		${python_cmd} scripts/RMOSA_delta_time.py rmosa_delta_time $seed1 $seed2 subjects.txt 1 $proc
		echo 'chmod 777 rmosa_delta_time/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './rmosa_delta_time/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "6" ]; then
		${python_cmd} scripts/MOSAover.py mosa_overtime $seed1 $seed2 subjects-overtime.txt 1 $proc
		echo 'chmod 777 mosa_overtime/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './mosa_overtime/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "7" ]; then
		${python_cmd} scripts/QMOSAover.py qmosa_overtime $seed1 $seed2 subjects-overtime.txt 1 $proc
		echo 'chmod 777 qmosa_overtime/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './qmosa_overtime/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "8" ]; then
		${python_cmd} scripts/RMOSAover.py rmosa_overtime $seed1 $seed2 subjects-overtime.txt 1 $proc
		echo 'chmod 777 rmosa_overtime/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './rmosa_overtime/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
done
