import java.util.Scanner;

public class EX_11 {
  public static void main(String[] args) {
    String inputValue = "";

    double diameter, area;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o diâmetro da circunferência: ");
    inputValue = scanner.next();
    diameter = Double.parseDouble(inputValue);

    Double radius = diameter / 2;

    area = Math.PI * Math.pow(radius, 2);

    System.out.println();
    System.out.println("Área da circunferência: " + area);
  }
}
