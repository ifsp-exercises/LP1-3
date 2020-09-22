import java.util.Scanner;

public class Util {

  // public Util() {}

  private static String requestInput(String message) {
    String inputValue = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print(message);
    inputValue = scanner.next();

    return inputValue;
  }

  public static double requestDouble(String message) {
    return Double.parseDouble(requestInput(message));
  }
}
