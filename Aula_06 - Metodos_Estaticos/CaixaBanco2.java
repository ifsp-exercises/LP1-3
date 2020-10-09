public class CaixaBanco2 {
  private int numCaixa;
  private static int senhaCliente;

  public CaixaBanco2(int x) {
    numCaixa = x;
    senhaCliente = 0;

    System.out.println("Caixa " + numCaixa + " aberto!");
  }

  void AtenderCliente() {
    senhaCliente++;
    System.out.println(
      "Cliente " + senhaCliente + " - Caixa " + numCaixa
    );
  }
}
