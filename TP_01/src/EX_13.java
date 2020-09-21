import java.util.Scanner;

public class EX_13 {
  public static void main(String[] args) {
    String inputValue = "";

    double initialVelocity, aceleration, percurseTime, finalVelocity;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a velocidade inicial (m/s): ");
    inputValue = scanner.next();
    initialVelocity = Double.parseDouble(inputValue);

    System.out.print("Informe a aceleração (m/s²): ");
    inputValue = scanner.next();
    aceleration = Double.parseDouble(inputValue);

    System.out.print("Informe o tempo de percurso (s): ");
    inputValue = scanner.next();
    percurseTime = Double.parseDouble(inputValue);

    finalVelocity = initialVelocity + (aceleration * percurseTime);

    System.out.println();
    System.out.println("Velocidade final (m/s): " + finalVelocity);
  }
}
