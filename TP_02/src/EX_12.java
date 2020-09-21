import java.util.Scanner;

public class EX_12 {
  public static void main(String[] args) {
    String inputValue = "";

    double height, radius, volume;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a altura do cone: ");
    inputValue = scanner.next();
    height = Double.parseDouble(inputValue);

    System.out.print("Informe o raio da base: ");
    inputValue = scanner.next();
    radius = Double.parseDouble(inputValue);

    volume = (Math.PI * Math.pow(radius, 2) * height) / 3;

    System.out.println();
    System.out.println("Volume do cone: " + volume);
  }
}
