public class String1 {

  public static void main(String[] args) {
    String Nome = "Angelo";

    for (int i = 0; i < Nome.length(); i++) {
      System.out.println(Nome.charAt(i));
    }

    String Novo = Nome.concat(" Evangelista");
    System.out.println(Novo);

    System.out.println(Novo.toLowerCase());
    System.out.println(Novo.toUpperCase());
  }
}
