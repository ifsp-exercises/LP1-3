public class EX_09 {

  public static void main(String[] args) {
    int dimentionX, dimentionY;

    double[][] originalMatrix;

    boolean itsAValidInput;

    do {
      dimentionX = Util.Input.requestInteger("Informe a ordem M da matrix(máximo de 10): ");

      itsAValidInput = dimentionX > 0 && dimentionX <= 10;
    } while (!itsAValidInput);

    do {
      dimentionY = Util.Input.requestInteger("Informe a ordem N da matrix(máximo de 10): ");

      itsAValidInput = dimentionY > 0 && dimentionY <= 10;
    } while (!itsAValidInput);

    originalMatrix = new double[dimentionX][dimentionY];

    for (int x = 1; x <= dimentionX; x++) {
      for (int y = 1; y <= dimentionY; y++) {
        double currentValue;

        currentValue = Util.Input.requestDouble("Insira o nome da posição " + x + "x" + y + " da matriz: ");

        int currentIndexX = x - 1, currentIndexY = y - 1;

        originalMatrix[currentIndexX][currentIndexY] = currentValue;
      }
    }
    System.out.println();
    System.out.println("Matriz transposta: ");
    System.out.println();

    for (int y = 0; y < dimentionY; y++) {
      for (int x = 0; x < dimentionX; x++) {
        System.out.print(" " + originalMatrix[x][y] + " ");
      }

      System.out.println();
    }
  }
}
