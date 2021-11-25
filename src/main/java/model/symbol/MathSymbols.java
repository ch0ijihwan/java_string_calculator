package model.symbol;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathSymbols {
    private final Queue<MathSymbol> inputtedMathSymbols;

    public MathSymbols(final List<String> inputtedExpression) {
        this.inputtedMathSymbols = IntStream.range(0, inputtedExpression.size())
                .filter(this::isOddNumber)
                .mapToObj(index -> MathSymbol.of(inputtedExpression.get(index)))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private boolean isOddNumber(final int number) {
        return (number % 2 == 1);
    }


    public int size() {
        return inputtedMathSymbols.size();
    }

    public MathSymbol poll() {
        return inputtedMathSymbols.poll();
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
