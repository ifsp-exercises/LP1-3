#! /bin/sh

for number in 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18; do
  echo "\n Exercício ${number} \n"

  FILENAME="EX_${number}"

  javac $FILENAME.java

  java $FILENAME
done

rm ./**.class
