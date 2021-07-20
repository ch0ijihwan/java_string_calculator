package model.ArithmeticOperation;

public class Subtraction {
    private final int number1;
    private final int number2;


    public Subtraction(String number1, String number2) {
        this.number1 = Integer.parseInt(number1);
        this.number2 = Integer.parseInt(number2);
    }


    public String Sub() {
        String result = String.valueOf(this.number1 - this.number2);
        return result;
    }
}
