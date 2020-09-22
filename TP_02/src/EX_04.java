public class EX_04 {

  public static void main(String[] args) {
    int dimentionX = 2, dimentionY = 3;

    double[][] matrix;

    matrix = new double[dimentionX][dimentionY];

    for (int i = 0; i < dimentionX; i++) {
      for (int j = 0; j < dimentionY; j++) {
        double currentValue;

        currentValue =
          Util.Input.requestDouble(
            "Insira o valor da posição " + i + "x" + j + " da matriz: "
          );

        matrix[i][j] = currentValue;
      }
    }
  }
}
