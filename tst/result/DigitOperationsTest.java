package result;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitOperationsTest {

    @Test
    public void lastDigit() {

        int actual;
        int test;

        for (int i = 0; i < 1000; i += 10)
            for (int j = 0; j < 10; j++) {

                test = j + i;
                actual = DigitOperations.lastDigit(test);

                // System.out.format("Number: %d, Last digit: %d\n", test, actual);

                assertEquals(j, actual);
            }
    }

    @Test
    public void digitOfTens() {

        int actual;
        int test;

        for (int h = 0; h < 10; h++)
            for (int t = 0; t < 10; t++)
                for (int u = 0; u < 10; u++) {

                    test = u + t * 10 + h * 100;
                    actual = DigitOperations.digitOfTens(test);

                    // System.out.format("Number: %d, Number of tens: %d\n", test, actual);

                    assertEquals(t, actual);
                }
    }

    @Test
    public void sumOfDigits() {

        int actual;
        int test;

        for (int h = 0; h < 10; h++)
            for (int t = 0; t < 10; t++)
                for (int u = 0; u < 10; u++) {

                    test = u + t * 10 + h * 100;
                    actual = DigitOperations.sumOfDigits(test);

                    // System.out.format("Number: %d, Sum of digits: %d\n", test, actual);

                    assertEquals(u + t + h, actual);
                }
    }
}