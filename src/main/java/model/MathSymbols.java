package model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MathSymbols {
    private final List<MathSymbol> inputtedMathSymbols;

    public MathSymbols(List<String> inputtedExpression) {
        this.inputtedMathSymbols = filterOutSymbols(inputtedExpression).stream()
                .map(MathSymbol::of)
                .collect(Collectors.toUnmodifiableList());
    }

    private List<String> filterOutSymbols(List<String> tokens) {
        return tokens.stream()
                .filter(this::isMathSymbol)
                .collect(Collectors.toUnmodifiableList());
    }

    private boolean isMathSymbol(String token) {
        try {
            MathSymbol.of(token);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public List<MathSymbol> getInputtedMathSymbols() {
        return inputtedMathSymbols;
    }

    public String getInputtedMathSymbol(int index) {
        return inputtedMathSymbols.get(index).getSymbol();
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
