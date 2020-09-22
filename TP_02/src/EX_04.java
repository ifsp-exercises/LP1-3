public class EX_04 {

  public static void main(String[] args) {
    int dimentionX = 2, dimentionY = 3;

    double[][] matrix;

    matrix = new double[dimentionX][dimentionY];

    for (int x = 1; x <= dimentionX; x++) {
      for (int y = 1; y <= dimentionY; y++) {
        double currentValue;

        currentValue =
          Util.Input.requestDouble(
            "Insira o valor da posição " + x + "x" + y + " da matriz: "
          );

        int
          currentIndexX = x -1,
          currentIndexY = y -1;

        matrix[currentIndexX][currentIndexY] = currentValue;
      }
    }

    for (int x = 0; x < dimentionX; x++) {
      for (int y = 0; y < dimentionY; y++) {

        System.out.print(" " + matrix[x][y] + " ");
      }

      System.out.println();
    }
  }
}
