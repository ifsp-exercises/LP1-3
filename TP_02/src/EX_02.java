public class EX_02 {

  public static void main(String[] args) {
    int quantityOfValues = 10;

    double[] positiveValues;

    positiveValues =
      Util.Input.requestDoubleArrayValues(
        quantityOfValues,
        false,
        true,
        false
      );

    double biggestValue = Util.Collections.findBiggest(positiveValues);
    double sum = Util.Collections.sumValues(positiveValues);
    double average = Util.Collections.calculateAverage(positiveValues);

    System.out.println("Maior valor: " + biggestValue);
    System.out.println("Soma dos valores: " + sum);
    System.out.println("Média aritmética: " + average);
  }
}
