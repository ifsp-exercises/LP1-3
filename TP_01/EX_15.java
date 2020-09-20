/*
  Proposta
    Entrar via teclado com o valor da cotação do dólar e uma certa 
    quantidade de dólares.
    Calcular e exibir o valor correspondente em Reais (R$). 
*/

import java.util.Scanner;

public class EX_15 {
  public static void main(String[] args) {
    String inputValue = "";

    double dollarQuote, quantityInDollars;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a cotação do dólar: ");
    inputValue = scanner.next();
    dollarQuote = Double.parseDouble(inputValue);

    System.out.print("Informe quantia em dólares a converter: ");
    inputValue = scanner.next();
    quantityInDollars = Double.parseDouble(inputValue);

    double quantityInReais;

    quantityInReais = quantityInDollars / dollarQuote;

    System.out.println();
    System.out.println("Quantia em reais: " + quantityInReais);
  }
}
