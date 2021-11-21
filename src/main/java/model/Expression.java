package model;

import model.number.Number;
import model.number.Numbers;
import model.symbol.MathSymbol;
import model.symbol.MathSymbols;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Expression {
    private static final int START = 0;
    private final Numbers numbers;
    private final MathSymbols mathSymbols;

    public Expression(final String[] inputtedExpression) {
        validateExpression(inputtedExpression);
        numbers = new Numbers(List.of(inputtedExpression));
        mathSymbols = new MathSymbols(List.of(inputtedExpression));
    }

    public Expression(final List<String> inputtedExpression) {
        numbers = new Numbers(inputtedExpression);
        mathSymbols = new MathSymbols(inputtedExpression);
    }

    private void validateExpression(final String[] expression) {
        validateExpressionSize(expression);
        validateExpressionForm(expression);
    }

    private void validateExpressionSize(final String[] expression) {
        int size = expression.length;
        if (!isOddNumber(size)) {
            throw new IllegalArgumentException("수식의 입력이 올바른 형태가 아닙니다.");
        }
    }

    private boolean isOddNumber(final int number) {
        return (number % 2 == 1);
    }


    private void validateExpressionForm(final String[] expression) {
        List<String> numbersOfExpression = new ArrayList<>();
        List<String> mathSymbolsOfExpression = new ArrayList<>();

        IntStream.range(START, expression.length).filter(index -> !isOddNumber(index))
                .forEach(index -> numbersOfExpression.add(expression[index]));

        IntStream.range(START, expression.length).filter(this::isOddNumber)
                .forEach(index -> mathSymbolsOfExpression.add(expression[index]));

        if (!(validateNumberForm(numbersOfExpression) && validateMathSymbolForm(mathSymbolsOfExpression))) {
            throw new IllegalArgumentException("수식의 형태가 이상합니다. 숫자 연산자 숫자 연산자의 반복 형태로 입력되지 않았습니다.");
        }
    }

    private boolean validateNumberForm(final List<String> tokens) {
        try {
            tokens.forEach(Number::new);
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }

    }

    private boolean validateMathSymbolForm(final List<String> tokens) {
        try {
            tokens.forEach(MathSymbol::of);
            return true;
        } catch (
                IllegalArgumentException exception) {
            return false;
        }
    }

    public int getMathSymbolsSize() {
        return mathSymbols.size();
    }

    public MathSymbol nextMathSymbol() {
        return mathSymbols.poll();
    }

    public int nextNumber() {
        return numbers.poll();
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