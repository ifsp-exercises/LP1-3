import java.util.Scanner;

public class EX_16 {
  public static void main(String[] args) {
    String inputValue = "";

    double angleInDegrees;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o ângulo em graus: ");
    inputValue = scanner.next();
    angleInDegrees = Double.parseDouble(inputValue);

    double angleInRadians;

    angleInRadians = angleInDegrees * Math.PI / 180;

    System.out.println();
    System.out.println("Seno: " + Math.sin(angleInRadians));
    System.out.println("Cosseno: " + Math.cos(angleInRadians));
    System.out.println("Tangente: " + Math.tan(angleInRadians));
    System.out.println("Secante: " + (1 / Math.cos(angleInRadians)));
  }
}
