/*
  Proposta
    Entrar via teclado com o valor de cinco produtos. 
    Após as entradas, digitar um valor referente ao 
    pagamento da somatória destes valores. 
    Calcular e exibir o troco que deverá ser devolvido. 
*/

import java.util.Scanner;

public class EX_18 {
  public static void main(String[] args) {
    String inputValue = "";

    double 
      sumOfPrices = 0, 
      paymentAmount, 
      quantityOfProducts = 5;
    
    Scanner scanner = new Scanner(System.in);

    for(int i = 1; i <= quantityOfProducts; i++) {
      double productCost;

      System.out.print("Informe o custo do " + i + "º produto: ");
      inputValue = scanner.next();
      productCost = Double.parseDouble(inputValue);
      
      sumOfPrices += productCost;
    }

    System.out.print("Informe valor pago: ");
    inputValue = scanner.next();
    paymentAmount = Double.parseDouble(inputValue);

    double remainingMoney;

    remainingMoney = paymentAmount - sumOfPrices;      

    System.out.println();
    System.out.println("Troco: " + remainingMoney);       
  }
}
