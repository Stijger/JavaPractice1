package tutorial;

public class ifElse {
    public static void main(String[] args) {
        If();
        Else();
        elseIf();
        shortHandElseIf();
        realLifeExamples();
    }

    public static void If() {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }
    }

    public static void Else() {
        //Syntax
        // if (condition) {
        //     // block of code to be executed if the condition is true
        // } else {
        //     // block of code to be executed if the condition is false
        // }

        int time = 20;
        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
        // Outputs "Good evening."
    }

    public static void elseIf() {
        int time = 22;
        if (time < 10) {
        System.out.println("Good morning.");
        } else if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
        // Outputs "Good evening."
    }

    public static void shortHandElseIf() {
        /*
         * Syntax:
         * variable = (condition) ? expressionTrue :  expressionFalse;
         */

         int time = 20;
         String result = (time < 18) ? "Good day." : "Good evening.";
         System.out.println(result);

        /* 
         * (time < 18) If statement
         * ? = If is true
         * : = Else
         */
    }

    public static void realLifeExamples() {
        int doorCode = 1337;

        if (doorCode == 1337) {
        System.out.println("Correct code. The door is now open.");
        } else {
        System.out.println("Wrong code. The door remains closed.");
        }

        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
        } else {
        System.out.println("Not old enough to vote.");
        }

        int myNum = 5;
        if (myNum % 2 == 0) {
        System.out.println(myNum + " is even");
        } else {
        System.out.println(myNum + " is odd");
        } 
    }
}
