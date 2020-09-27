import java.util.Scanner;

public class Util {

  public static class Input {

    private static Scanner scanner;

    private static String requestInput(String message) {
      String inputValue = "";
      scanner = new Scanner(System.in);

      System.out.print(message);
      inputValue = scanner.next();

      return inputValue;
    }

    public static double requestDouble(String message) {
      return Double.parseDouble(requestInput(message));
    }

    public static String requestString(String message) {
      return requestInput(message);
    }

    public static int requestInteger(String message) {
      return Integer.parseInt(requestInput(message));
    }

    public static boolean requestConfirmation(String message) {
      String inputValue;
      boolean itsAValidEntry;

      do {
        inputValue = requestInput(message + "(S/N): ");

        itsAValidEntry =
          inputValue.equals("S") ||
          inputValue.equals("s") ||
          inputValue.equals("N") ||
          inputValue.equals("n");
      } while (!itsAValidEntry);

      return inputValue.equals("S") || inputValue.equals("s") ? true : false;
    }

    public static double[] requestDoubleArrayValues(
      int quantityOfValues,
      boolean allowNegatives,
      boolean allowPositives,
      boolean allowZeros
    ) {
      double[] values = new double[quantityOfValues];

      for (int i = 1; i <= quantityOfValues; i++) {
        double currentValue;
        boolean itsAValidEntry;

        do {
          currentValue =
            Util.Input.requestDouble("Insira o " + i + "º valor: ");

          itsAValidEntry = true;

          if (itsAValidEntry && !allowNegatives && currentValue < 0) {
            itsAValidEntry = false;
          }

          if (itsAValidEntry && !allowPositives && currentValue > 0) {
            itsAValidEntry = false;
          }

          if (itsAValidEntry && !allowZeros && currentValue == 0) {
            itsAValidEntry = false;
          }
        } while (!itsAValidEntry);

        int currentIndex = i - 1;

        values[currentIndex] = currentValue;
      }

      return values;
    }
  }

  public static class Collections {

    public static double calculateAverage(double[] values) {
      int quantityOfValues;
      double sum;

      quantityOfValues = values.length;

      sum = sumValues(values);

      double average = sum / quantityOfValues;

      return average;
    }

    public static double sumValues(double[] values) {
      double sum = 0;

      for (double value : values) {
        sum += value;
      }

      return sum;
    }

    public static double findBiggest(double[] values) {
      double biggest = values[0];

      for (double value : values) {
        if (value > biggest) biggest = value;
      }

      return biggest;
    }

    public static double findSmallest(double[] values) {
      double smallest = values[0];

      for (double value : values) {
        if (value < smallest) smallest = value;
      }

      return smallest;
    }

    public static double getQuantityOfNegatives(double[] values) {
      double quantity = 0;

      for (double value : values) {
        if (value < 0) quantity++;
      }

      return quantity;
    }

    public static double getQuantityOfPositives(double[] values) {
      double quantity = 0;

      for (double value : values) {
        if (value > 0) quantity++;
      }

      return quantity;
    }
  }
}
