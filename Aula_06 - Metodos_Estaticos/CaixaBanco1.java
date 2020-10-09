public class CaixaBanco1 {
  private int numCaixa;
  private int senhaCliente;

  public CaixaBanco1(int x) {
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
