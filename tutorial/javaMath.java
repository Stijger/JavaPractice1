package tutorial;

public class javaMath {
    public static void main(String[] args) {
        mathMax();
        mathMin();
        mathSqrt();
        mathRandom();
    }

    public static void mathMax() {
        // The Math.max(x,y) method can be used to find the highest value of x and y:
        int x = 5;
        int y = 10;
        System.out.println(Math.max(x, y));
    }

    public static void mathMin() {
        // The Math.min(x,y) method can be used to find the lowest value of x and y:
        int x = 5;
        int y = 10;
        System.out.println(Math.min(x, y));
    }

    public static void mathSqrt() {
        // The Math.sqrt(x) method returns the square root of x:
        System.out.println(Math.sqrt(64));
    }

    public static void mathRandom() {
        System.out.println(Math.random());

        int randomNum = (int)(Math.random() * 101); // a number between 0 to 100
        System.out.println(randomNum);
    }
}
