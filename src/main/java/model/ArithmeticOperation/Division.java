package model.ArithmeticOperation;

public class Division {
    private  int number1;
    private  int number2;

    public Division(String number1, String number2) {
        this.number1 = Integer.parseInt(number1);
        this.number2 = Integer.parseInt(number2);
    }

    public String Div(){

        if(number2<0)
            throw  new ArithmeticException("나눔수가 0입니다.");

        String result = String.valueOf( this.number1 / this.number2);

        return result;
    }
}
