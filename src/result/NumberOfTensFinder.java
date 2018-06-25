package result;

public class NumberOfTensFinder implements IResult {

    private final String DESCRIPTION = "Input number and you will get it's number of tens";

    @Override
    public int getResult(int num) {
        return Math.abs(num) % 100;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
