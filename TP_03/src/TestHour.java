package src;

import java.util.Scanner;

public class TestHour {
  private static String title = "Testing class \"Hour\"";
  private static Scanner scanner = new Scanner(System.in);

  private static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  private static void test(String title, Hour hour) {
    System.out.println("📈  " + title);
    System.out.println();

    System.out.println("Hours: " + hour.getHours());
    System.out.println("Minutes: " + hour.getMinutes());
    System.out.println("Seconds: " + hour.getSeconds());
    System.out.println("Time in seconds: " + hour.toSeconds());
    System.out.println("Formatted time: " + hour.getCompleteHour());
    System.out.println("Formatted time: " + hour.getCompleteHour(true));
    System.out.println();
    System.out.println();
  }

  private static void refreshTitle() {
    clear();
    System.out.println(title);
    System.out.println();
  }

  private static void setTitle(String newTitle) {
    title = newTitle;
    refreshTitle();
  }

  public static void main(String[] args) {
    int hours, minutes, seconds;
    boolean isValidValue = true;

    refreshTitle();

    setTitle(
      "I - Initializing first object: Construct with params \n ➜ Requesting values"
    );

    do {
      if (!isValidValue) {
        System.out.println(
          "❌  Attention! The value you entered is invalid for a hours"
        );
      }
      System.out.print("Insert a valid value for \"hours\": ");
      hours = scanner.nextInt();

      isValidValue = Hour.isValidHour(hours);

      refreshTitle();
    } while (!isValidValue);

    do {
      if (!isValidValue) {
        System.out.println(
          "❌  Attention! The value you entered is invalid for a minutes"
        );
      }
      System.out.print("Insert a valid value for \"minutes\": ");
      minutes = scanner.nextInt();

      isValidValue = Hour.isValidMinute(minutes);

      refreshTitle();
    } while (!isValidValue);

    do {
      if (!isValidValue) {
        System.out.println(
          "❌  Attention! The value you entered is invalid for a seconds"
        );
      }
      System.out.print("Insert a valid value for \"seconds\": ");
      seconds = scanner.nextInt();

      isValidValue = Hour.isValidSecond(seconds);

      refreshTitle();
    } while (!isValidValue);

    setTitle(
      "I - Initializing first object: Construct with params \n ➜ Initializing"
    );

    Hour hour_01 = new Hour(hours, minutes, seconds);

    setTitle(
      "II - Initializing second object: Construct without params \n ➜ Requesting values, but they will not be used... ❌"
    );

    Hour hour_02 = new Hour();

    setTitle(
      "II - Initializing second object: Construct without params \n ➜ Requesting values, now they will be used. ✅"
    );

    do {
      if (!isValidValue) {
        System.out.println(
          "❌  Attention! The value you entered is invalid for a hours"
        );
      }
      System.out.print("Insert a valid value for \"hours\": ");
      hours = scanner.nextInt();

      isValidValue = Hour.isValidHour(hours);

      refreshTitle();
    } while (!isValidValue);

    do {
      if (!isValidValue) {
        System.out.println(
          "❌  Attention! The value you entered is invalid for a minutes"
        );
      }
      System.out.print("Insert a valid value for \"minutes\": ");
      minutes = scanner.nextInt();

      isValidValue = Hour.isValidMinute(minutes);

      refreshTitle();
    } while (!isValidValue);

    do {
      if (!isValidValue) {
        System.out.println(
          "❌  Attention! The value you entered is invalid for a seconds"
        );
      }
      System.out.print("Insert a valid value for \"seconds\": ");
      seconds = scanner.nextInt();

      isValidValue = Hour.isValidSecond(seconds);

      refreshTitle();
    } while (!isValidValue);

    hour_02.setHours(hours);
    hour_02.setMinutes(minutes);
    hour_02.SetSeconds(seconds);

    setTitle(
      "III - Initializing third object: Construct without params \n ➜ Requesting values, but they will not be used... ❌"
    );

    Hour hour_03 = new Hour();

    setTitle(
      "III - Initializing third object: Construct without params \n ➜ Requesting values, now they will be used. ✅"
    );

    hour_03.setHours();
    refreshTitle();
    hour_03.setMinutes();
    refreshTitle();
    hour_03.SetSeconds();
    refreshTitle();

    test("Tests using the parameterized constructor", hour_01);
    test("Tests using object with manual data, setters with params", hour_02);
    test(
      "Tests using object with manual data, setters without params",
      hour_03
    );
  }
}
