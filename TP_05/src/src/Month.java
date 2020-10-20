package src;

public class Month {
  public final int code;
  public final String name;

  public static int[] validMonths = new int[] {
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
  };

  public static Month[] months = new Month[] {
    new Month(0, "January"),
    new Month(1, "February"),
    new Month(2, "March"),
    new Month(3, "April"),
    new Month(4, "May"),
    new Month(5, "June"),
    new Month(6, "July"),
    new Month(7, "August"),
    new Month(8, "September"),
    new Month(9, "October"),
    new Month(10, "November"),
    new Month(11, "December"),
  };

  private Month(int code, String name) {
    this.code = code;
    this.name = name;
  }
}
