public class Media 
{
  private int val1;
  private int val2;

  public Media(int x, int y)
  {
    val1 = x;
    val2 = y;
  }

  public Media(int x)
  {
    val1 = x;
    val2 = x;
  }

  public Media()
  {
    val1 = 0;
    val2 = 0;
  }
 
  public float CalcMedia() 
  {
    return (val1 + val2) / 2f;
  }
}