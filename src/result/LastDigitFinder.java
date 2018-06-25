package result;

public class LastDigitFinder implements IResult {

    final String DISCRIPTION = "Input number and you will get it's last digit";

    @Override
    public int getResult(int num) {
        return Math.abs(num) % 10;
    }

    @Override
    public String getDiscription() {
        return DISCRIPTION;
    }
}
