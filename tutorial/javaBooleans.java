package tutorial;

public class javaBooleans {
    public static void main() {

    }

    public static void booleans() {
        // A boolean type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }

    public static void booeleanExpression() {
        // you can use a comparison operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:
        System.out.println(10 > 9); // returns true, because 10 is higher than 9

        int x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10

        System.out.println(10 == 15); // returns false, because 10 is not equal to 15
    }

    public static void realLifeExamples() {
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
        } else {
        System.out.println("Not old enough to vote.");
        }
    }
}
