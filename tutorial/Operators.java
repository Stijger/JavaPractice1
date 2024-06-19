package tutorial;
public class Operators {
    public static void main(String[] args) {
        operator();
        additionAssignment();
        comparisonOperators();
        logicalOperators();
    }

    public static void operator() {
        // In the example below, we use the + operator to add together two values:
        int x = 100 + 50;
        System.out.println(x);

        // Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable:
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println(sum3);
    }

    public static void additionAssignment() {
        // operator += add value to variable, for example here it adds 5 to 10, so the output is 15
        int x = 10;
        x += 5;
        System.out.println(x);
    }

    public static void comparisonOperators() {
        /*
         * Comparison operators are used to compare two values (or variables).
         * The return value of a comparison is either true or false.
         */

        int x = 5;
        int y = 3;
        System.out.println(x > y); // returns true, because 5 is higher than 3

        int a = 1;
        int b = 1;
        System.out.println(a == b); // returns true, because 1 is equal to 1

        int c = 1;
        int d = 2;
        System.out.println(c != d); // returns true, because 1 is not equal to 2

        int e = 10;
        int f = 5;
        System.out.println("e > f: " + (e > f));  // returns true, because 10 is larger than 5

        int g = 3;
        int h = 8;
        System.out.println("g < h: " + (g < h));  // True, because 3 is smaller than 8

        int i = 7;
        int j = 7;
        System.out.println("i >= j: " + (i >= j));  // True, because 7 is larger or equal to 7

        int k= 4;
        int l = 6;
        System.out.println("k <= l: " + (k <= l));  // True, because 4 is smaller and not equal to 6
    }

    public static void logicalOperators() {
        // Returns true if both statements are true
        int a = 1;
        int b = 3;
        System.out.println(a < 2 && b < 5);

        // Returns true if one of the statements is true
        int c = 1;
        int d = 3;
        System.out.println(c < 2 || d < 2);

        // Reverse the result, returns false if the result is true
        int e = 1;
        int f = 3;
        System.out.println(!(e < 2 && f < 5));
    }
} 
