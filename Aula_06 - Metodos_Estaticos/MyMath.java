public class MyMath {
  private static int resultado;

  public static int soma(int x, int y) {
    resultado = x + y;

    return resultado;
  }

  public static int subtrai(int x, int y) {
    return x - y;
  }

  public static int multiplica(int x, int y) {
    return x * y;
  }

  public static double divide(int x, int y) {
    return (double) x / (double) y;
  }
}
