import java.util.Scanner;

public class EX_04 {
  public static void main(String[] args) {
    String inputValue = "";
    double base, height, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a base do triângulo: ");
    inputValue = scanner.next();
    base = Double.parseDouble(inputValue);

    System.out.print("Informe a altura do triângulo: ");
    inputValue = scanner.next();
    height = Double.parseDouble(inputValue);

    area = (base * height) / 2;

    System.out.println();
    System.out.println("Área do triângulo: " + area);
  }
}
