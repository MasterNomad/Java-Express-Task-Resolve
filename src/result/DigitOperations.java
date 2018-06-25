package result;

public class DigitOperations {

    public static int lastDigit (int num) {
        return Math.abs(num) % 10;
    }

    public static int digitOfTens (int num) {
        return Math.abs(num) / 10 % 10;
    }

    public static int sumOfDigits (int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /=  10;
        }
        return sum;
    }

    // Without if
    public static int nextEvenNumber (int num) {
        final int[] arr = {2, 1};
        return num + arr[num % 2];
    }

}
