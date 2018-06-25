package result;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastDigitFinderTest {

    @Test
    public void getResult() {
        IResult result = new LastDigitFinder();
        int actual = result.getResult(226);
        int test =0;
        for (int i = 0; i < 1000; i += 10)
            for (int j = 0; j < 10; j++) {

                test = j + i;
                actual = result.getResult(test);

               // System.out.format("Number: %d, Last digit:%d\n", test, actual);

                assertEquals(j, actual);
            }

    }


}