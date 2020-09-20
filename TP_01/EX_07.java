/*
  Proposta
    Calcular e exibir a média geométrica de dois valores 
    quaisquer que serão digitados
*/

import java.util.Scanner;

public class EX_07 {
  public static void main(String[] args) {
    String inputValue = "";
    double 
      average, 
      productOfValues = 1,
      countOfValues = 2;
    
    double[] values = new double[(int)countOfValues];
    
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i <= countOfValues; i++) {
      double convertedValue;

      System.out.print("Informe o " + i +"º valor: ");
      inputValue = scanner.next();
      
      convertedValue = Double.parseDouble(inputValue);

      productOfValues *= convertedValue;
    }

    average = Math.pow(productOfValues, (1 / countOfValues));

    System.out.println();
    System.out.println("Média geométrica: " + average);
  }
}
