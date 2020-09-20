class FindAverage {
  public static void main(String[] args) {
    double[] array = {
      5,
      7, 
      2,
      4,
      9 
    };

    double average = calculateAverage(array);

    System.out.println(average);
  }

  public static double calculateAverage(double[] collection) {
    double larger = collection[0];
    double smaller = collection[0];
    double sum = 0;

    for (double item : collection) {
      if(item > larger) larger = item;
      if(item < smaller) smaller = item;

      sum += item;
    }

    sum -= (larger + smaller);

    double average = sum / (collection.length - 2);

    return average; 
  }
}