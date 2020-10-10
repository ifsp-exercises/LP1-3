#! /bin/sh

# javac -sourcepath ./src ./src/TestHour.java -d ./build
javac TestHour.java -d ./build

java -cp ./build/ TestHour

rm ./build/ -rf
