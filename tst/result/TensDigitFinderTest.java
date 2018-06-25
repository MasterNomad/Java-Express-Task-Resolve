package result;

import org.junit.Test;

import static org.junit.Assert.*;

public class TensDigitFinderTest {

    @Test
    public void getResult() {

        IResult result = new TensDigitFinder();

        int actual;
        int test;

        for (int i = 0; i < 10; i ++)
            for (int j = 0; j < 10; j++) {

                test = j + i * 10;
                actual = result.getResult(test);

                // System.out.format("Number: %d, Number of tens: %d\n", test, actual);

                assertEquals(i, actual);
            }
    }

}
