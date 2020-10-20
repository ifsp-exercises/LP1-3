package src;

import java.util.Scanner;

public class TemperatureSample {
  private Hour hour;
  private MyDate date;
  private float value;
  private int sequenceNumber;

  private static int counter = 0;
  private static Scanner scanner = new Scanner(System.in);

  public TemperatureSample() {
    this.value = ++counter;
    this.hour = new Hour();
    this.date = new MyDate();
    this.sequenceNumber = counter;
  }

  public TemperatureSample(MyDate date, Hour hour, float value) {
    this.date = date;
    this.hour = hour;
    this.value = value;
    this.sequenceNumber = ++counter;
  }

  public TemperatureSample(
    int year,
    int month,
    int day,
    int hours,
    int minutes,
    int seconds,
    float value
  ) {
    this.date = new MyDate(day, month, year);
    this.hour = new Hour(hours, minutes, seconds);
    this.value = value;

    this.sequenceNumber = ++counter;
  }

  public int getSequenceNumber() {
    return this.sequenceNumber;
  }

  public String getDate() {
    return this.date.getCompleteDate();
  }

  public String getHour() {
    return this.hour.getCompleteHour();
  }

  public float getValue() {
    return this.value;
  }

  public void setHours() {
    Hour hour = new Hour();

    this.hour = hour;
  }

  public void setHours(int hours, int minutes, int seconds) {
    Hour hour = new Hour(hours, minutes, seconds);

    this.hour = hour;
  }

  public void setDate() {
    MyDate date = new MyDate();

    this.date = date;
  }

  public void setDate(int day, int month, int year) {
    MyDate date = new MyDate(day, month, year);

    this.date = date;
  }

  public void setValue() {
    System.out.print("Insert a valid value for \"value\": ");

    this.value = scanner.nextFloat();
  }

  public void setValue(int value) {
    this.value = value;
  }
}
