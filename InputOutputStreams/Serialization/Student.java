import java.io.Serializable;

public class Student implements Serializable {
  private int rollNo;
  private String name;
  private String dept;

  // static and transient properties will not be serialized
  // public static int data = 10;
  // public transient int t;

  // Mandatory to read object from an InputStream
  public Student() {
  }

  public Student(int rollNo, String name, String dept) {
    this.rollNo = rollNo;
    this.name = name;
    this.dept = dept;
  }

  public int getRollNo() {
    return rollNo;
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  @Override
  public String toString() {
    return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";
  }
}
