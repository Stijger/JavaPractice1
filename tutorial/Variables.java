package tutorial;
public class Variables {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
       /*
        * Basic syntax for java variables:
        * "type variableName = value;"
        */
        String name = "John"; //string variable
        System.out.println(name);

        int myNum = 3; //int variable
        System.out.println(myNum);

        /*
         * Asigning new value to variable overwrites the first.
         */
        myNum = 5; //int variable
        System.out.println(myNum);

        /*
         * Final keyword is the same as const in typescript, unchangable.
         */
        final int finalNum = 15;
        System.out.println(finalNum);

        /*
         * different variable types
         */
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        /*
         * Call other variable methods to main class
         */
        displayVariables();
        multipleVariables();
        realLifeExample();
    }

    public static void displayVariables() {
        /*
         * put space between "hello " and the bracket, otherwise there will be no spaces in output
         */
        String name = "john";
        System.out.println("hello " + name);


        /*
         * use the + character to add a variable to another variable:
         */
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        /*
         * For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):
         */
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
    }

    public static void multipleVariables() {
        /*
         * To declare more than one variable of the same type, you can use a comma-separated list:
         */
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        /*
         * You can also assign the same value to multiple variables in one line:
         */
        
        int x1, y1, z1;
        x1 = y1 = z1 = 50;
        System.out.println(x1 + y1 + z1);
    }

    @SuppressWarnings("unused")
    public static void identifiers() {
        /*
         * It is recommended to use descriptive names in order to create understandable and maintainable code:
         */
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
    }

    public static void realLifeExample() {
        /*
         * a program that stores different data of a college student:
         */
        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        /*
         * a program to calculate the area of a rectangle (by multiplying the length and width):
         */
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}