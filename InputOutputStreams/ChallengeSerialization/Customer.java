import java.io.Serializable;

public class Customer implements Serializable {
  private String customerId;
  private String name;
  private String phoneNumber;

  private static int customerCount = 0;

  public Customer() {
  }

  public Customer(String name, String phoneNumber) {
    customerCount++;
    customerId = "C" + customerCount;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public static void setCustomerCount(int customerCount) {
    Customer.customerCount = customerCount;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public static int getCustomerCount() {
    return customerCount;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
  }
}
