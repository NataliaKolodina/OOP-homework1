// package homework.homework1;

public class HotDrink {
  public String name;
  public int volume;
  // не совсем поняла, нужен ли здесь приват и гет (если мы не делаем класс
  // HotDrink абстрактным? или достаточно паблик name и volume и тогда геты е
  // нужны вообще?

  public HotDrink(String name, int volume) {
    this.name = name;
    this.volume = volume;
  }

  // public String getName() { //это в случае, если мы оставляем private
  // return name;
  // }

  // public int getVolume() {
  // return volume;
  // }

}