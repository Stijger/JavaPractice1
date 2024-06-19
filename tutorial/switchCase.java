package tutorial;

public class switchCase {
    public static void main(String[] args) {
        switchStatement();
        defaultStatement();
    }

    public static void switchStatement() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            }
            // Outputs "Thursday" (day 4)
    }

    public static void defaultStatement() {
        /*
         * When Java reaches a break keyword, it breaks out of the switch block.
         * This will stop the execution of more code and case testing inside the block.
         */
        // The default keyword specifies some code to run if there is no case match:
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
            }
            // Outputs "Looking forward to the Weekend"
    }
}