package model.ArithmeticOperation;

public class Multiplication {

    private int number1;
    private int number2;

    public Multiplication(String number1, String number2) {
        this.number1 = Integer.parseInt(number1);
        this.number2 = Integer.parseInt(number2);
    }

    public String Multiple() {
        String result = String.valueOf(this.number1 * this.number2);
        return result;

    }


}
