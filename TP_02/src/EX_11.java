public class EX_11 {

  public static void main(String[] args) {
    int dimension;

    double[][] matrix;

    boolean itsAValidInput;

    do {
      dimension =
        Util.Input.requestInteger(
          "Informe a ordem M da matrix(máximo de 10): "
        );

      itsAValidInput = dimension > 0 && dimension <= 10;
    } while (!itsAValidInput);

    matrix = new double[dimension][dimension];

    for (int x = 1; x <= dimension; x++) {
      for (int y = 1; y <= dimension; y++) {
        double currentValue;

        currentValue =
          Util.Input.requestDouble(
            "Insira o valor da posição " + x + "x" + y + " da matriz: "
          );

        int currentIndexX = x - 1, currentIndexY = y - 1;

        matrix[currentIndexX][currentIndexY] = currentValue;
      }
    }
    System.out.println();
    System.out.println("Exibindo a matriz normalmente: ");
    System.out.println();

    for (int x = 0; x < dimension; x++) {
      for (int y = 0; y < dimension; y++) {
        System.out.print(" " + matrix[x][y] + " ");
      }

      System.out.println();
    }
  }
}
