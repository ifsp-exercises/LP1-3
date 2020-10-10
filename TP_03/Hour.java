import java.util.Scanner;

public class Hour {
  private int hours;
  private int minutes;
  private int seconds;

  private final String hourTemplate = "%s:%s:%s";
  private Scanner scanner;

  private String formatSingleValue(int value) {
    String stringifiedValue = "00" + Integer.toString(value);

    return stringifiedValue.substring(stringifiedValue.length() - 2);
  }

  private void validate() throws Exception {
    if (this.hours < 0 || this.hours > 23) {
      throw new Exception("Invalid value for hours");
    }

    if (this.minutes < 0 || this.minutes > 59) {
      throw new Exception("Invalid value for minutes");
    }

    if (this.seconds < 0 || this.seconds > 59) {
      throw new Exception("Invalid value seconds");
    }
  }

  private int hoursToMinutes(int hours) {
    return hours * 60;
  }

  private int minutesToSeconds(int minutes) {
    return minutes * 60;
  }

  public static boolean isValidHour(int hour) {
    return hour >= 0 && hour < 24;
  }

  public static boolean isValidMinute(int minute) {
    return minute >= 0 && minute < 60;
  }

  public static boolean isValidSecond(int second) {
    return second >= 0 && second < 60;
  }

  public void validate(int hours, int minutes, int seconds) throws Exception {
    if (hours < 0 || hours > 23) {
      throw new Exception("Invalid value for hours");
    }

    if (minutes < 0 || minutes > 59) {
      throw new Exception("Invalid value for minutes");
    }

    if (seconds < 0 || seconds > 59) {
      throw new Exception("Invalid value seconds");
    }
  }

  public Hour() {
    this.setHours();
    this.setMinutes();
    this.SetSeconds();

    this.hours = 0;
    this.minutes = 0;
    this.seconds = 0;
  }

  public Hour(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setHours(int hours) {
    this.hours = hours;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetSeconds(int seconds) {
    this.seconds = seconds;

    try {
      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setHours() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"hours\": ");
      this.hours = scanner.nextInt();

      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setMinutes() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"minutes\": ");
      this.minutes = scanner.nextInt();

      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetSeconds() {
    try {
      this.scanner = new Scanner(System.in);

      System.out.print("Insert a valid value for \"seconds\": ");
      this.seconds = scanner.nextInt();

      validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int getHours() {
    return this.hours;
  }

  public int getMinutes() {
    return this.minutes;
  }

  public int getSeconds() {
    return this.seconds;
  }

  public int toSeconds() {
    int amountOfMinutes = 0, amountOfSeconds = 0;

    amountOfMinutes += this.minutes + hoursToMinutes(this.hours);

    amountOfSeconds += this.seconds + minutesToSeconds(amountOfMinutes);

    return amountOfSeconds;
  }

  public String getCompleteHour() {
    String completeHour = String.format(
      this.hourTemplate,
      formatSingleValue(this.hours),
      formatSingleValue(this.minutes),
      formatSingleValue(this.seconds)
    );

    return completeHour;
  }

  public String getCompleteHour(boolean twelveHoursFormat) {
    boolean isPostMeridiem = this.hours - 12 > 0;

    String suffix = isPostMeridiem ? "PM" : "AM";

    String completeHour = String.format(
      this.hourTemplate + " %s",
      formatSingleValue(isPostMeridiem ? this.hours - 12 : this.hours),
      formatSingleValue(this.minutes),
      formatSingleValue(this.seconds),
      suffix
    );

    return completeHour;
  }
}
