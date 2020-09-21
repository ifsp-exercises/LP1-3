import java.util.Scanner;

public class EX_01 {
  public static void main(String[] args) {
    String inputValue = "";
    double base, height, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a base do retângulo: ");
    inputValue = scanner.next();
    base = Double.parseDouble(inputValue);

    System.out.print("Informe a altura do retângulo: ");
    inputValue = scanner.next();
    height = Double.parseDouble(inputValue);

    area = base * height;

    System.out.println();
    System.out.println("Área do retângulo: " + area);
  }
}
