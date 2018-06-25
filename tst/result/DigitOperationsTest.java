package result;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitOperationsTest {

    @Test
    public void lastDigit() {

        int actual;
        int expected;
        int test;

        for (int i = 0; i < 1000; i += 10)
            for (int j = 0; j < 10; j++) {

                test = j + i;
                actual = DigitOperations.lastDigit(test);
                expected = j;

                // System.out.format("Number: %d, Last digit: %d\n", test, actual);

                assertEquals(expected, actual);
            }
    }

    @Test
    public void digitOfTens() {

        int actual;
        int expected;
        int test;

        for (int h = 0; h < 10; h++)
            for (int t = 0; t < 10; t++)
                for (int u = 0; u < 10; u++) {

                    test = u + t * 10 + h * 100;
                    actual = DigitOperations.digitOfTens(test);
                    expected = t;

                    // System.out.format("Number: %d, Number of tens: %d\n", test, actual);

                    assertEquals(expected, actual);
                }
    }

    @Test
    public void sumOfDigits() {

        int actual;
        int expected;
        int test;

        for (int h = 0; h < 10; h++)
            for (int t = 0; t < 10; t++)
                for (int u = 0; u < 10; u++) {

                    test = u + t * 10 + h * 100;
                    actual = DigitOperations.sumOfDigits(test);
                    expected = u + t + h;

                    // System.out.format("Number: %d, Sum of digits: %d\n", test, actual);

                    assertEquals(expected, actual);
                }
    }

    @Test
    public void nextEvenNumber() {

        int actual;
        int expected;

        for (int i = 0; i < 1000; i++) {

            actual = DigitOperations.nextEvenNumber(i);
            System.out.format("Number: %d, Next even Number: %d\n", i, actual);
            expected = i % 2 == 0 ? i + 2 : i + 1;

            assertEquals(expected, actual);
        }
    }
}