/*
  Proposta
    Calcular e exibir a média aritmética de quatro valores 
    quaisquer que serão digitados.
*/

import java.util.Scanner;

public class EX_06 {
  public static void main(String[] args) {
    String inputValue = "";
    double 
      average, 
      sumOfValues = 0,
      countOfValues = 4;
    
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i <= countOfValues; i++) {
      double convertedValue;

      System.out.print("Informe o " + i +"º valor: ");
      inputValue = scanner.next();
      
      convertedValue = Double.parseDouble(inputValue);

      sumOfValues += convertedValue;
    }

    average = sumOfValues / countOfValues;

    System.out.println();
    System.out.println("Média aritmética: " + average);
  }
}
