public class GoodsBuild {

  Goods temp;

  public GoodsBuild() {
    temp = new Goods();
    temp.name = "EMPTY";
    temp.count = 0;
    temp.description = new StringBuilder("EMPTY");
    temp.price = 0;
  }

  public GoodsBuild setName(String name) {
    temp.name = name;
    return this;
  }

  public GoodsBuild setCount(int count) {
    temp.count = count;
    return this;
  }

  public GoodsBuild setPrice(double price) {
    temp.price = price;
    return this;
  }

  public GoodsBuild setDescription(String str) {
    temp.description = new StringBuilder(str);
    return this;
  }

  public Goods create() {
    return temp;
  }

  public void print() {
    System.out.println(
      "назввание товара: " +
      temp.name +
      ", Кол-во: " +
      temp.count +
      ", Цена: " +
      temp.price +
      ", Описание: " +
      temp.description
    );
  }
}
