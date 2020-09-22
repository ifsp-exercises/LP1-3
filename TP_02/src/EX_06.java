public class EX_06 {

  public static void main(String[] args) {
    int dimentionX = 2, dimentionY = 3;

    String[][] matrix;

    matrix = new String[dimentionX][dimentionY];

    for (int x = 1; x <= dimentionX; x++) {
      for (int y = 1; y <= dimentionY; y++) {
        String currentValue;

        currentValue =
          Util.Input.requestString(
            "Insira o nome da posição " + x + "x" + y + " da matriz: "
          );

        int currentIndexX = x - 1, currentIndexY = y - 1;

        matrix[currentIndexX][currentIndexY] = currentValue;
      }
    }

    System.out.println();
    for (int x = 0; x < dimentionX; x++) {
      for (int y = 0; y < dimentionY; y++) {
        System.out.print(" " + matrix[x][y] + " ");
      }

      System.out.println();
    }
  }
}
