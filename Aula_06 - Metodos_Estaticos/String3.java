public class String3 {

  public static void main(String[] args) {
    String S1 = "10";
    String S2 = "1000000";
    String S3 = "35.5";
    String S4 = "234.5678901";
    String S5 = "true";

    int n1 = Integer.parseInt(S1);
    long n2 = Long.parseLong(S2);
    float f3 = Float.parseFloat(S3);
    double f4 = Double.parseDouble(S4);

    System.out.println(n1);
    System.out.println(n2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(Boolean.valueOf(S5));

    System.out.println(S1);
    System.out.println(S2);
    System.out.println(S3);
    System.out.println(S4);
    System.out.println(S5);
  }
}
