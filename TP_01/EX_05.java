import java.util.Scanner;

public class EX_05 {
  public static void main(String[] args) {
    String inputValue = "";
    double diameter, radius, volume;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o diâmetro da esfera: ");
    inputValue = scanner.next();
    diameter = Double.parseDouble(inputValue);

    radius = diameter / 2;

    volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

    System.out.println();
    System.out.println("Volume da esfera: " + volume);
  }
}
