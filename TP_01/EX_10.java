/*
  Proposta
    Entrar via teclado com o valor de uma temperatura em graus Celsius, 
    calcular e exibir sua temperatura equivalente em Fahrenheit
*/

import java.util.Scanner;

public class EX_10 {
  public static void main(String[] args) {
    String inputValue = "";

    double celsius, fahrenheit;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a temperature em graus celsius: ");
    inputValue = scanner.next();
    celsius = Double.parseDouble(inputValue);

    fahrenheit = 32 + ( celsius * 9/5 );

    System.out.println();
    System.out.println("Gruas em fahrenheit: " + fahrenheit);
  }
}
