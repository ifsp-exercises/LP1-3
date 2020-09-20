public class Gift{
  public static void main(String [] args){
    int [] anArray = func();

    for(int i=0;i<3;i++){
    System.out.println("\nValor = " + anArray[i]);
    }
  }

  public static int[] func(){
    int [] anArray = {1,2,3,4};
    
    return anArray;
  }
}