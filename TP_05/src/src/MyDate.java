package src;

import java.text.*;
import java.util.*;

public class MyDate {
  private int year;
  private int month;
  private int day;

  private Scanner scanner;

  private String formatSingleValue(int value, int numOfDigits) {
    String zeros = "";

    for (int i = 0; i < numOfDigits; i++) {
      zeros += "0";
    }

    String stringifiedValue = zeros + Integer.toString(value);

    return stringifiedValue.substring(stringifiedValue.length() - numOfDigits);
  }

  public boolean isLeapYear() {
    return this.year % 4 == 0;
  }

  public boolean isValidMonthCode(int code) {
    boolean validMonthCode = false;

    for (int monthCode : Month.validMonths) {
      if (monthCode == code) {
        validMonthCode = true;
      }
    }

    return validMonthCode;
  }

  private void validate() throws Exception {
    if (this.year <= 0) {
      throw new Exception("Invalid value for \"year\".");
    }

    if (!isValidMonthCode(this.month)) {
      throw new Exception("Invalid value for \"month\"");
    }

    if (this.day > 31) {
      throw new Exception("Invalid value for \"day\", maximum of 31.");
    }

    if (this.month == 1) {
      if (!this.isLeapYear() && this.day > 28) {
        throw new Exception(
          "Invalid value for \"day\" on February in a normal year."
        );
      } else if (this.day > 29) {
        throw new Exception(
          "Invalid value for \"day\" on February in a leap year."
        );
      }
    }
  }

  public MyDate() {
    this.year = 0;
    this.month = 0;
    this.day = 0;

    this.setYear();
    this.setMonth();
    this.SetDay();
  }

  public MyDate(int day, int month, int year) {
    this.year = year;
    this.month = month;
    this.day = day;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int getYear() {
    return this.year;
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  public void setYear(int year) {
    this.year = year;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMonth(int month) {
    this.month = month;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetDay(int day) {
    this.day = day;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setYear() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"year\": ");
      this.year = scanner.nextInt();

      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMonth() {
    try {
      this.scanner = new Scanner(System.in);

      int choice;

      System.out.println("Choose one option for \"month\":");
      System.out.println();

      for (Month currentMonth : Month.months) {
        System.out.println(currentMonth.code + " - " + currentMonth.name);
      }

      System.out.println();

      boolean invalidChoice = false;

      do {
        if (invalidChoice) {
          System.out.println(
            "Your previous choice is invalid, please choose one correctly."
          );
        }

        System.out.print("Your choice: ");
        choice = scanner.nextInt();

        invalidChoice = !isValidMonthCode(choice);
      } while (invalidChoice);

      this.month = choice;

      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetDay() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"day\": ");
      this.day = scanner.nextInt();

      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String getCompleteDate() {
    String hourTemplate = "%s/%s/%s";

    String completeDate = String.format(
      hourTemplate,
      formatSingleValue(this.day, 2),
      formatSingleValue(this.month + 1, 2),
      formatSingleValue(this.year, 4)
    );

    return completeDate;
  }

  public String getCompleteDate(boolean extensiveMonth) {
    String hourTemplate = "%s/%s/%s";

    String stringMonth = "";

    for (Month month : Month.months) {
      if (this.month == month.code) {
        stringMonth = month.name;
        continue;
      }
    }

    String completeDate = String.format(
      hourTemplate,
      formatSingleValue(this.day, 2),
      stringMonth,
      formatSingleValue(this.year, 4)
    );

    return completeDate;
  }

  public int getPassedDays() {
    int countOfDays = 0;

    countOfDays += this.month * 30;
    countOfDays += this.day;

    return countOfDays;
  }

  public String getCurrentDate() {
    DateFormat dateFormat = DateFormat.getDateInstance(
      DateFormat.FULL,
      Locale.ENGLISH
    );

    String formattedDate = dateFormat.format(new Date());

    return formattedDate;
  }
}
