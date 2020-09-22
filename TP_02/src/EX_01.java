public class EX_01 {

  public static void main(String[] args) {
    double x, y;

    x = Util.Input.requestDouble("Informe o primeiro valor: ");

    do {
      y = Util.Input.requestDouble("Digite um valor maior que o primeiro: ");
    } while (x >= y);
  }
}
