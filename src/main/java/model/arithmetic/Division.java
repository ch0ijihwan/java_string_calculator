package model.arithmetic;

public class Division implements Operation {
    private final int number1;
    private final int number2;

    public Division(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int operate() {
        if (number2 == 0) {
            throw new IllegalArgumentException("나눔수가 0 입니다");
        }
        return number1 / number2;
    }
}
