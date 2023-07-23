echo *** Example calls on Simula-Compiler
echo *** Compile and execute HelloWord
java -jar .\simula.jar
pause
java -cp %SIMULA_HOME%\simula.jar -jar .\simula.jar .\tst\HelloWord.sim
pause
java -cp .\simula.jar -jar .\tst\HelloWord.jar
pause
java -jar .\tst\HelloWord.jar
pause
echo *** Compile and execute Jensen's Device
pause
java -cp %SIMULA_HOME%\simula.jar -jar .\simula.jar .\tst\JensensDevice.sim
pause
java -cp .\simula.jar -jar .\tst\JensensDevice.jar
pause
java -jar .\tst\JensensDevice.jar
pause
echo *** Compile and execute Simulatio of FittingRoom
pause
java -cp %SIMULA_HOME%\simula.jar -jar .\simula.jar .\tst\FittingRoom.sim
pause
java -cp .\simula.jar -jar .\tst\FittingRoom.jar
pause
java -jar .\tst\FittingRoom.jar
pause
