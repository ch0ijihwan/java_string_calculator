package model;

import model.ArithmeticOperation.Addition;
import model.ArithmeticOperation.Division;
import model.ArithmeticOperation.Multiplication;
import model.ArithmeticOperation.Subtraction;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class SendCalculation {
    private Deque<String> numbers;
    private Deque<String> symbols;


    public SendCalculation(List<String> numbers, List<String> symbols) {
        this.numbers = new ArrayDeque<>(numbers);
        this.symbols = new ArrayDeque<>(symbols);
    }

    public String Calculation() {

        int count = symbols.size();

        for (int i = 0; i < count; i++) {
            String operator = symbols.poll();
            String num1 = String.valueOf(numbers.poll());
            String num2 = String.valueOf(numbers.poll());

            if (operator.equals("+")) {

                Addition addition = new Addition(num1, num2);
                String addResult = addition.Add();
                numbers.addFirst(addResult);
            }
            if (operator.equals("-")) {
                Subtraction subtraction = new Subtraction(num1, num2);
                String subResult = subtraction.Sub();
                numbers.addFirst(subResult);
            }
            if (operator.equals("*")) {
                Multiplication multiplication = new Multiplication(num1, num2);
                String mulResult = multiplication.Multiple();
                numbers.addFirst(mulResult);
            }
            if (operator.equals("/")) {
                Division division = new Division(num1, num2);
                String divResult = division.Div();
                numbers.addFirst(divResult);
            }

        }
        return numbers.poll();

    }


}
