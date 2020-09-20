class FindLeaders {
  public static void main(String[] args) {
    double[] array = {
      5,
      7, 
      2,
      4
    };

    double[] leaders = findLeaders(array);

    for(double leader : leaders ) {
      System.out.println(leader);
    }
  }

  public static double[] findLeaders(double[] collection) {
    boolean[] statusOfPossibleLeaders = new boolean[collection.length];
    int countOfLeaders = 0;

    System.out.println(collection.length);

    for (
      int indexOfElegible = 0; 
      indexOfElegible < (collection.length - 1);
      indexOfElegible++
    ) {
      boolean isLeader = true;

      for(int i = indexOfElegible; i < (collection.length - 1); i++) {
        System.out.println("Vou ver se o " + collection[indexOfElegible] + " é maior que o " + collection[i + 1]);

        if(isLeader){
          if(collection[indexOfElegible] <= collection[i + 1]) {
            isLeader = false;
            break;
          }
        }
      }

      statusOfPossibleLeaders[indexOfElegible] = isLeader;
      
      if(isLeader) countOfLeaders++;

      System.out.println("---------");
    }

    double[] leaders = new double[countOfLeaders];

    for(int i = 0; i < collection.length; i++) {
      if(statusOfPossibleLeaders[i]){
        leaders[i] = collection[i]; 
      }
    }

    return leaders; 
  }
}