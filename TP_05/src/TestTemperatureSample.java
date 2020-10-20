import src.TemperatureSample;

public class TestTemperatureSample {

  public static void showProperties(TemperatureSample temperature) {
    System.out.println("Sequence number: " + temperature.getSequenceNumber());
    System.out.println("Value: " + temperature.getValue());
    System.out.println("Hour: " + temperature.getHour());
    System.out.println("Date: " + temperature.getDate());
  }

  public static void addDelimiter() {
    System.out.println("");
    System.out.println("--------------------");
    System.out.println("");
  }

  public static void main(String[] args) {
    TemperatureSample temperatureSample_01 = new TemperatureSample(
      2001,
      5,
      24,
      4,
      50,
      0,
      21
    );

    showProperties(temperatureSample_01);

    addDelimiter();

    //|>
    TemperatureSample temperatureSample_02 = new TemperatureSample();

    showProperties(temperatureSample_02);

    addDelimiter();

    //|>
    temperatureSample_01.setDate();
    temperatureSample_01.setHours();
    temperatureSample_01.setValue();

    showProperties(temperatureSample_01);
  }
}
