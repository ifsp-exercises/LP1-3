#! /bin/sh

# javac -sourcepath ./src ./src/TestHour.java -d ./build
javac src/TestHour.java -d ./build

java -cp ./build/ src.TestHour

rm ./build/ -rf
