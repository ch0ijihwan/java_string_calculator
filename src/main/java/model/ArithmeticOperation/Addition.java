package model.ArithmeticOperation;

public class Addition {
    private  int number1;
    private  int number2;

    public Addition(String number1, String number2) {
        this.number1 = Integer.parseInt(number1);
        this.number2 = Integer.parseInt(number2);
    }

    public String Add(){

        String result = String.valueOf( this.number1 + this.number2);

        return result;

    }

}
