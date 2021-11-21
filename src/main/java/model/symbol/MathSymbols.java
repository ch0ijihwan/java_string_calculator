package model.symbol;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MathSymbols {
    private static final int FIRST_INDEX = 0;
    private static final int SECOND_INDEX = 1;
    private List<MathSymbol> inputtedMathSymbols;

    public MathSymbols(final List<String> inputtedExpression) {
        this.inputtedMathSymbols = filterOutSymbols(inputtedExpression).stream()
                .map(MathSymbol::of)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<MathSymbol> getInputtedMathSymbols() {
        return inputtedMathSymbols;
    }

    private List<String> filterOutSymbols(final List<String> tokens) {
        return tokens.stream()
                .filter(this::isMathSymbol)
                .collect(Collectors.toUnmodifiableList());
    }

    private boolean isMathSymbol(final String token) {
        try {
            MathSymbol.of(token);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public int size() {
        return inputtedMathSymbols.size();
    }

    public MathSymbol poll() {
        MathSymbol mathSymbol = inputtedMathSymbols.get(FIRST_INDEX);
        int lastIndex = inputtedMathSymbols.size();
        inputtedMathSymbols = inputtedMathSymbols.subList(SECOND_INDEX, lastIndex);
        return mathSymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSymbols that = (MathSymbols) o;
        return Objects.equals(inputtedMathSymbols, that.inputtedMathSymbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputtedMathSymbols);
    }

    @Override
    public String toString() {
        return "MathSymbols{" +
                "inputtedMathSymbols=" + inputtedMathSymbols +
                '}';
    }
}
