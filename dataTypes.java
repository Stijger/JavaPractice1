public class dataTypes {
    public static void main(String[] args) {
        dataTypeExample();
        numbers();
        booleans();
        characters();
        realLifeExamples();
    }

    @SuppressWarnings("unused")
    public static void dataTypeExample() {
        /*
        * a variable in Java must be a specified data type:
        */
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number, Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double myDouble = 5.1111111; //Double, Stores fractional numbers. Sufficient for storing 15 decimal digits
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
    }
    
    public static void numbers() {
        // The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
        byte myByte = 100;
        System.out.println(myByte);

        // The short data type can store whole numbers from -32768 to 32767:
        short myShort = 5000;
        System.out.println(myShort);

        // The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
        int myInt = 100000;
        System.out.println(myInt);

        // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
        long myLong = 15000000000L;
        System.out.println(myLong);

        /*
         * The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
         * Use float or double?
         * The precision of a floating point value indicates how many digits the value can have after the decimal point. 
         * The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. 
         * Therefore it is safer to use double for most calculations.
         */
        // float
        float myFloat = 5.75f;
        System.out.println(myFloat);

        // double
        double myDouble = 19.99d;
        System.out.println(myDouble);

        // Scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }

    public static void booleans() {
        // Booleans can only be true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }

    public static void characters() {
        // The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
        char myGrade = 'B';
        System.out.println(myGrade);

        /*
         * ASCII values
         * Output: A B C
         */
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }

    public static void realLifeExamples() {
        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
} 