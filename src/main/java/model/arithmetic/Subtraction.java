package model.arithmetic;

public class Subtraction implements Operation{
    private final int number1;
    private final int number2;

    public Subtraction(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int operate() {
        return number1 - number2;
    }
}
