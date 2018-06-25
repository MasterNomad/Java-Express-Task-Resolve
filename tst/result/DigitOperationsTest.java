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

        for (int i = 0; i < 10; i ++)
            for (int j = 0; j < 10; j++) {

                test = j + i * 10;
                actual = DigitOperations.digitOfTens(test);

                // System.out.format("Number: %d, Number of tens: %d\n", test, actual);

                assertEquals(i, actual);
            }
    }
}