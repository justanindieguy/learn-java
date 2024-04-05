/**
 * Class for Library Book
 *
 * @author Emmanuel Hernandez
 * @version 2.0
 * @since 2024
 */
public class Book {
  /**
   * @value 10 default value
   */
  static int val = 10;

  /**
   * Parametrized constructor
   *
   * @param str Book name
   */
  public Book(String str) {
  }

  /**
   * Issue a book to a Student
   *
   * @param roll roll number of a Student
   * @throws Exception if Book is not available, throws Exception
   */
  public void issue(int roll) throws Exception {
  }

  /**
   * Check if Book is available
   *
   * @param str Book name
   * @return if book is available returns true, else false
   */
  public boolean available(String str) {
    return true;
  }

  /**
   * Get Book name
   * 
   * @param id Book id
   * @return returns Book name
   */
  public String getName(int id) {
    return "";
  }
}
