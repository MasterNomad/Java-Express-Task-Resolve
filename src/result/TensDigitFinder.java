package result;

public class TensDigitFinder implements IResult {

    private final String DESCRIPTION = "Input number and you will get it's tens digit";

    @Override
    public int getResult(int num) {
        return Math.abs(num) / 10 % 10;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
