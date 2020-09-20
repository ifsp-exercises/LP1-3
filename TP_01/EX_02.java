/*
  Proposta
    Calcular e exibir a área de um quadrado, 
    a partir do valor de sua aresta que será digitado. 
*/

import java.util.Scanner;

public class EX_02 {
  public static void main(String[] args) {
    String inputValue = "";
    double edge, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a aresta do quadrado: ");
    inputValue = scanner.next();
    edge = Double.parseDouble(inputValue);

    area = Math.pow(edge, 2);

    System.out.println();
    System.out.println("Área do quadrado: " + area);
  }
}
