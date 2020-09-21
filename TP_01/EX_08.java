import java.util.Scanner;

public class EX_08 {
  public static void main(String[] args) {
    double mileInMeters = 1852;
    double kilometerInMeters = 1000;

    String inputValue = "";
    double miles, distanceInMeters, distanceInKilometers;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a distância em milhas: ");
    inputValue = scanner.next();

    miles = Double.parseDouble(inputValue);

    distanceInMeters = miles * mileInMeters;

    distanceInKilometers = distanceInMeters / kilometerInMeters;

    System.out.println();
    System.out.println("Distância em quilômetros: " + distanceInKilometers);
  }
}
