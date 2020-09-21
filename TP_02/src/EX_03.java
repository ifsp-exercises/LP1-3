import java.util.Scanner;

public class EX_03 {
  public static void main(String[] args) {
    String inputValue = "";
    double diagonal, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a diagonal do quadrado: ");
    inputValue = scanner.next();
    diagonal = Double.parseDouble(inputValue);

    area = Math.pow(diagonal, 2) / 2;

    System.out.println();
    System.out.println("Área do quadrado: " + area);
  }
}
