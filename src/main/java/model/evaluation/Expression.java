package model.evaluation;

import model.evaluation.number.Number;
import model.evaluation.number.Numbers;
import model.evaluation.symbol.Operator;
import model.evaluation.symbol.Operators;

import java.util.List;

public class Expression {

    private final Numbers numbers;
    private final Operators operators;

    public Expression(String[] dividedValues) {

        numbers = new Numbers(dividedValues);
        symbols = new Symbols(dividedValues);

    }

    public List<Number> getEvaluatedNumbers() {
        return numbers.getNumbers();
    }

    public List<Operator> getEvaluatedOperators() {
        return operators.getEvaluatedOperators();
    }

    public Numbers getNumbers() {
        return numbers;
    }

    public Operators getOperators() {
        return operators;
    }
}
