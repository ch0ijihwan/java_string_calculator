package model.arithmetic;

public class Multiplication implements Operation {

    private final int number1;
    private final int number2;

    public Multiplication(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int operate() {
        return this.number1 * this.number2;
    }
}
