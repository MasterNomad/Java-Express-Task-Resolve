package result;

public class DigitOperations {

    public static int lastDigit (int num) {
        return Math.abs(num) % 10;
    }

    public static int digitOfTens (int num) {
        return Math.abs(num) / 10 % 10;
    }


}
