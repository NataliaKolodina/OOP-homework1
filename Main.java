// package homework.homework1;

public class Main {
  public static void main(String[] args) {
    Coffee espresso = new Coffee("Эспрессо", 30);
    Coffee cappuccino = new Coffee("Каппучино", 200);
    Coffee macchiato = new Coffee("Маккиато", 250);

    espresso.temperature(90);
    cappuccino.temperature(100);
    macchiato.temperature(60);

    System.out.println("////////////////");

    HotDrinkAuto tea = new HotDrinkAuto();
    HotDrinkAuto hotWine = new HotDrinkAuto();
    HotDrinkAuto milk = new HotDrinkAuto();

    System.out.println(tea.getProduct("Чай", 200, 80));
    System.out.println(hotWine.getProduct("Глинтвейн", 250, 90));
    System.out.println(milk.getProduct("Молоко", 150, 70));
  }
}
