/*
  Proposta
    Calcular e exibir a tensão de um determinado circuito eletrônico a partir 
    dos valores da resistência e corrente elétrica que serão digitados. 
    Utilize a lei de Ohm. 
*/

import java.util.Scanner;

public class EX_09 {
  public static void main(String[] args) {
    String inputValue = "";

    double resistence, electricCurrent, voltage;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a resistência: ");
    inputValue = scanner.next();
    resistence = Double.parseDouble(inputValue);

    System.out.print("Informe a corrente elétrica: ");
    inputValue = scanner.next();
    electricCurrent = Double.parseDouble(inputValue);

    voltage = resistence * electricCurrent;

    System.out.println();
    System.out.println("Potencial elétrico: " + voltage);
  }
}
