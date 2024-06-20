package tutorial;

public class forLoop {
    public static void main(String[] args) {
        forLoops();
        nestedLoop();
        forEachLoop();
        realLifeExamples();
    }

    public static void forLoops() {
        /*
         * When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
         * Statement 1 is executed (one time) before the execution of the code block.
         * Statement 2 defines the condition for executing the code block.
         * Statement 3 is executed (every time) after the code block has been executed.
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Only print even values between 0 and 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void nestedLoop() {
        /*It is also possible to place a loop inside another loop. This is called a nested loop.
         * The "inner loop" will be executed one time for each iteration of the "outer loop":
         */

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
    
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 
    }

    public static void forEachLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void realLifeExamples() {
        // a program that counts to 100 by tens:
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }

        // a program that only print even values between 0 and 10:
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
