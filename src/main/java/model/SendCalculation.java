package model;

import model.arithmetic.Addition;
import model.arithmetic.Division;
import model.arithmetic.Multiplication;
import model.arithmetic.Subtraction;

import java.util.List;
import java.util.stream.IntStream;

public class SendCalculation {
    private List<Number> numbers;
    private List<Operator> operators;
    private static int result;

    public SendCalculation(List<Number> numbers, List<Operator> symbols) {
        this.numbers = numbers;
        this.operators = symbols;
        result = numbers.get(0).value();
        numbers.remove(0);
    }

    static void parseOperator(Operator operator, int number) {
        if (operator.equals(Operator.PLUS)) {
            result = new Addition(number, result).operate();
        } else if (operator.equals(Operator.MINUS)) {
            result = new Subtraction(result, number).operate();
        } else if (operator.equals(Operator.DIVIDE)) {
            result = new Division(result, number).operate();
        } else if (operator.equals(Operator.MULTIPLY)) {
            result = new Multiplication(result, number).operate();
        }
    }

    public void Calculation() {
        IntStream.range(0, operators.size())
                .forEach(index -> parseOperator(operators.get(index), numbers.get(index).value()));
    }

    public int outResult() {
        return result;
    }

}
