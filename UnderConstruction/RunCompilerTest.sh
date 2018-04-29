printf "*** Example calls on Simula-Compiler\n"
printf "*** Compile and execute HelloWord\n"
java -jar ./Simula.jar
read -p "Press enter to continue"
java -cp %SIMULA_HOME%/Simula.jar -jar ./Simula.jar ./tst/HelloWord.sim
read -p "Press enter to continue"
java -cp ./Simula.jar -jar ./tst/HelloWord.jar
read -p "Press enter to continue"
java -jar ./tst/HelloWord.jar
read -p "Press enter to continue"
printf "*** Compile and execute Jensen\'s Device\n"
read -p "Press enter to continue"
java -cp %SIMULA_HOME%/Simula.jar -jar ./Simula.jar ./tst/JensensDevice.sim
read -p "Press enter to continue"
java -cp ./Simula.jar -jar ./tst/JensensDevice.jar
read -p "Press enter to continue"
java -jar ./tst/JensensDevice.jar
read -p "Press enter to continue"
printf "*** Compile and execute Simulatio of FittingRoom\n"
read -p "Press enter to continue"
java -cp %SIMULA_HOME%/Simula.jar -jar ./Simula.jar ./tst/FittingRoom.sim
read -p "Press enter to continue"
java -cp ./Simula.jar -jar ./tst/FittingRoom.jar
read -p "Press enter to continue"
java -jar ./tst/FittingRoom.jar
read -p "Press enter to continue"