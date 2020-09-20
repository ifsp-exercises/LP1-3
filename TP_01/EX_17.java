/*
  Proposta
    Entrar via teclado com dois valores quaisquer “X” e “Y”. 
    Calcular e exibir o cálculo XY (“X” elevado a “Y”). 
    Pesquisar as funções Exp e Ln.
*/

import java.util.Scanner;

public class EX_17 {
  public static void main(String[] args) {
    String inputValue = "";

    double x, y;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor de X: ");
    inputValue = scanner.next();
    x = Double.parseDouble(inputValue);

    System.out.print("Informe o valor de Y: ");
    inputValue = scanner.next();
    y = Double.parseDouble(inputValue);

    System.out.println();
    System.out.println("X^Y: " + Math.pow(x, y));       
  }
}
