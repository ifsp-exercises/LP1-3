import java.util.Scanner;

public class EX_14 {
  public static void main(String[] args) {
    String inputValue = "";

    double sphereRadius, cubeEdge;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o raio da esfera: ");
    inputValue = scanner.next();
    sphereRadius = Double.parseDouble(inputValue);

    System.out.print("Informe a aresta do cubo: ");
    inputValue = scanner.next();
    cubeEdge = Double.parseDouble(inputValue);

    double cubeVolume, sphereVolume, freeVolume;

    cubeVolume = Math.pow(cubeEdge, 3);
    sphereVolume = (4 * Math.PI * Math.pow(sphereRadius, 3)) / 3;

    freeVolume = cubeVolume - sphereVolume;

    System.out.println();
    System.out.println("Volume livre: " + freeVolume);
  }
}
