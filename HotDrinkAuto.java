// package homework.homework1;

public class HotDrinkAuto implements Automat {

  @Override
  public String getProduct(String name, int volume, int temper) {
    return name + " имеет объём " + volume + " мл и температуру " + temper + "°С.";
  }
}
