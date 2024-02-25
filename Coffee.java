// package homework.homework1;

public class Coffee extends HotDrink {
  public Coffee(String name, int volume) {
    super(name, volume);
  }

  public void temperature(int temperature) {
    System.out.println("Температура " + name + " " + volume + " мл равна " + temperature + "°С.");

    // System.out.println("Температура " + getName() + " " + getVolume() + " мл
    // равна " + temperature + "°С."); // это в случае, если мы оставляем private в
    // HotDrink

  }

}