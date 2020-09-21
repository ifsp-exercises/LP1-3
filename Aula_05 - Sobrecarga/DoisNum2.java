public class DoisNum2 
{
  private int A;
  private int B;

  public DoisNum2(int x, int y) 
  {
    A = x;
    B = y;
  }

  public DoisNum2(int x) 
  {
    A = x;
    B = x;
  }

  public DoisNum2() { }

  public void EntraA(int x)
  {
    A = x;
  }

  public void EntraB(int x)
  {
    B = x;
  }

  public int RetA()
  {
    return A;
  }

  public int RetB()
  {
    return B;
  }

  public int Soma() 
  {
    return A + B;
  }

  public int Subtrai() 
  {
    return A - B;
  }

  public int Multiplica() 
  {
    return A * B;
  }

  public int Divide() 
  {
    if(B != 0) {
      return A / B;
    }

    return 0;
  }
}