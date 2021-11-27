package model;

import model.calculation.Calculation;
import model.number.Numbers;
import model.symbol.MathSymbol;
import model.symbol.MathSymbols;

import java.util.List;
import java.util.Objects;

public class Expression {
    private final Numbers numbers;
    private final MathSymbols mathSymbols;

    public Expression(final String[] inputtedExpression) {
        validateExpressionSize(inputtedExpression);
        numbers = new Numbers(List.of(inputtedExpression));
        mathSymbols = new MathSymbols(List.of(inputtedExpression));
    }

    public Expression(final List<String> inputtedExpression) {
        numbers = new Numbers(inputtedExpression);
        mathSymbols = new MathSymbols(inputtedExpression);
    }

    private void validateExpressionSize(final String[] expression) {
        int size = expression.length;
        if (!isOddNumber(size)) {
            throw new IllegalArgumentException("수식의 입력이 잘못 되었습니다.(수식의 길이가 짝수개 입니다. 수식의 길이는 홀수개여야 합니다.)");
        }
        if (size < 3) {
            throw new IllegalArgumentException("최소한의 수식이 입력되지 않았습니다.");
        }
    }


    private boolean isOddNumber(final int number) {
        return (number % 2 == 1);
    }

    public int getAnswer() {
        int answer;

        answer = numbers.poll();
        while (numbers.hasNext()) {
            MathSymbol mathSymbol = mathSymbols.poll();
            int nextNumber = numbers.poll();
            Calculation calculation = MathSymbolFinder.findStrategy(mathSymbol);
            answer = calculation.calculate(answer, nextNumber);
        }
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expression that = (Expression) o;
        return Objects.equals(numbers, that.numbers) && Objects.equals(mathSymbols, that.mathSymbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers, mathSymbols);
    }

    @Override
    public String toString() {
        return "Expression{" +
                "numbers=" + numbers +
                ", mathSymbols=" + mathSymbols +
                '}';
    }
}