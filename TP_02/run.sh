#! /bin/sh

for number in 01 02 03 04 05 06 07 08 09; do
  echo "\n Exercício ${number} \n"

  FILENAME="EX_${number}"

  javac -sourcepath ./src ./src/$FILENAME.java -d ./build

  java -cp ./build/ $FILENAME
done

rm ./build/ -rf

print "Infelizmente, as últimas duas não foram realizadas."

########

# FILENAME=EX_11

# javac -sourcepath ./src ./src/$FILENAME.java -d ./build

# java -cp ./build/ $FILENAME
