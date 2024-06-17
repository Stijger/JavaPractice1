 
/* 
 * Filename must always match class name in file.
 * Every program must contain Main() method.
 */
public class Main {
  /*
   * System is a built-in Java class that contains useful members, such as out, which is short for "output".
   * The println() method, short for "print line", is used to print a value to the screen (or a file).
   * you need them together to print stuff to the screen.
   */
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");
    /*
    * There is also a print() method, which is similar to println(). 
    * The only difference is that it does not insert a new line at the end of the output
    */
    System.out.print("Hello World! ");
    System.out.print("I will print on the same line.");

    /*
     * You can also perform mathematical calculations inside the println() method:
     */
    System.out.println(3); //Single line comment
    System.out.println(3 + 5);
    System.out.println(2 * 5);
  }
}