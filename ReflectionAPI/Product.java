public class Product {
  private String id;
  private String name;
  private int stock;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Product [id=" + id + ", name=" + name + ", stock=" + stock + "]";
  }
}
