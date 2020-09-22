public class EX_03 {

  public static void main(String[] args) {
    int quantityOfValues;
    boolean isInTheValidRange, continueExecuting;

    do {
      do {
        quantityOfValues =
          Util.Input.requestInteger(
            "Informe a quantidade de valores a utilizar (menor que 20): "
          );

        isInTheValidRange = quantityOfValues > 0 && quantityOfValues <= 20;
      } while (!isInTheValidRange);

      double[] values;

      values =
        Util.Input.requestDoubleArrayValues(
          quantityOfValues,
          true,
          true,
          false
        );

      double biggest = Util.Collections.findBiggest(values);
      double smallest = Util.Collections.findSmallest(values);
      double sum = Util.Collections.sumValues(values);
      double average = Util.Collections.calculateAverage(values);
      double quantityOfNegatives = Util.Collections.getQuantityOfNegatives(
        values
      );
      double quantityOfPositives = Util.Collections.getQuantityOfPositives(
        values
      );

      System.out.println();
      System.out.println("Maior valor: " + biggest);
      System.out.println("Menor valor: " + smallest);
      System.out.println("Soma dos valores: " + sum);
      System.out.println("Média aritmética: " + average);
      System.out.println("Quantidade de positivos: " + quantityOfPositives);
      System.out.println("Quantidade de negativos: " + quantityOfNegatives);
      System.out.println();

      continueExecuting =
        Util.Input.requestConfirmation("Deseja executar novamente?");
    } while (continueExecuting);
  }
}
