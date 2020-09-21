public class TestaMedia 
{
  public static void main(String[] args) 
  {
    Media exemplo1 = new Media(10);
    Media exemplo2 = new Media(3, 4);
    
    System.out.println("Média: " + exemplo1.CalcMedia());
    System.out.println("Média: " + exemplo2.CalcMedia());
  }
}