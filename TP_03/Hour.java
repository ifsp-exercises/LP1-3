public class Hour {
  private int hours;
  private int minutes;
  private int seconds;

  private final String hourTemplate = "%d:%d:%d";

  private void Validate() throws Exception {
    if (this.hours < 0) {
      throw new Exception("Invalid value for hours");
    }

    if (this.minutes < 0) {
      throw new Exception("Invalid value for minutes");
    }

    if (this.seconds < 0) {
      throw new Exception("Invalid value seconds");
    }
  }

  public Hour() {
    this.hours = 0;
    this.minutes = 0;
    this.seconds = 0;
  }

  public Hour(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;

    try {
      Validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetHours(int hours) {
    this.hours = hours;

    try {
      Validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetMinutes(int minutes) {
    this.minutes = minutes;

    try {
      Validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void SetSeconds(int seconds) {
    this.seconds = seconds;

    try {
      Validate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int GetHours() {
    return this.hours;
  }

  public int GetMinutes() {
    return this.minutes;
  }

  public int GetSeconds() {
    return this.seconds;
  }

  private int HoursToMinutes(int hours) {
    return hours * 60;
  }

  private int MinutesToSeconds(int minutes) {
    return minutes * 60;
  }

  public int ToSeconds() {
    int amountOfminutes = 0, amountOfSeconds = 0;

    amountOfminutes += this.minutes + HoursToMinutes(this.hours);

    amountOfSeconds += this.seconds + MinutesToSeconds(amountOfminutes);

    return amountOfSeconds;
  }

  public String getCompleteHour() {
    String completeHour = String.format(this.hourTemplate, this.hours, this.minutes, this.seconds);

    return completeHour;
  }
}
