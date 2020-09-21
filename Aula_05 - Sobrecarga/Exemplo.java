public class Exemplo 
{
  static float media(int a, int b)
  {
    float media;

    media = ( a + b ) / 2.0f;

    return media;
  }

  public static void main(String[] args) 
  {
    float retorno;

    retorno = media(5, 6);

    System.out.println("Média: " + retorno);
  }
}