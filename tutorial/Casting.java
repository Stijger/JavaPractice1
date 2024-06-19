package tutorial;
public class Casting {
    public static void main(String[] args) {
        wideningCasting();
        narrowingCasting();
        realLifeExample();
    }

    public static void wideningCasting() {
        // Widening casting is done automatically when passing a smaller size type to a larger size type:
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }

    public static void narrowingCasting() {
        // Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }

    public static void realLifeExample() {
        // set maximum score
        int maxScore = 500;

        //actual score of user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}
