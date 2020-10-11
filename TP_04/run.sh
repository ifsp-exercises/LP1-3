#! /bin/sh

# javac -sourcepath ./src ./src/TestHour.java -d ./build
javac -sourcepath ./src src/TestDate.java -d ./build

java -cp ./build/ TestDate

rm ./build/ -rf
