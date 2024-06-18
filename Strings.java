public class Strings {
    public static void main(String[] args) {
        stringLength();
        stringCases();
        stringIndexOf();
        stringConcatenation();
        stringsAndNumbers();
    }

    public static void stringLength() {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length()); // Output should be 26
    }

    public static void stringCases() {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
    }

    public static void stringIndexOf() {
        // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
    }

    public static void stringConcatenation() {
        // The + operator can be used between strings to combine them. This is called concatenation:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); // Note that i have added an empty text (" ") to create a space between firstName and lastName on print.

        // other method
        String first = "John";
        String last = "Doe";
        System.out.println(first.concat(last));
    }

    public static void stringsAndNumbers() {
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println(z);

        String a = "10";
        String b = "20";
        String c = a + b;  // z will be 1020 (a String)
        System.out.println(c);

        String d = "10";
        int e = 20;
        String f = d + e;  // z will be 1020 (a String)
        System.out.println(f);
    }

}
