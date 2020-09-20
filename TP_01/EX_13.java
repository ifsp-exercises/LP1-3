/*
  Proposta
    Calcular e exibir a velocidade final (em km/h) de um automóvel, 
    a partir dos valores da 
    velocidade inicial (em m/s), 
    da aceleração (m/s²) e do 
    tempo de percurso (em s) que serão digitados.
*/

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
