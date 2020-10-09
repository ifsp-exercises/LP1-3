public class String2 {

  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 1000000;
    float f1 = 35.5f;
    double f2 = 234.5678901;
    boolean b1 = true;

    String S1 = Integer.toString(n1);
    String S2 = Long.toString(n2);
    String S3 = Float.toString(f1);
    String S4 = Double.toString(f2);
    String S5 = Boolean.toString(b1);
    String S6 = String.valueOf(f2);

    System.out.println(S1);
    System.out.println(S2);
    System.out.println(S3);
    System.out.println(S4);
    System.out.println(S5);
    System.out.println(S6);

    System.out.println("Com valueOf = " + S6);
  }
}
