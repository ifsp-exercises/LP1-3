#! /bin/sh

javac -sourcepath ./src src/TestTemperatureSample.java -d ./build

java -cp ./build/ TestTemperatureSample

rm ./build/ -rf
