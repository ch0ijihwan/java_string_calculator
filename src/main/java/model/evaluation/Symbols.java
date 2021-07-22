package model.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Symbols {
    private static final String[] EXPRESSION_SYMBOLS = {"+", "-", "*", "/"};
    private final String[] dividedValues;

    public Symbols(String[] dividedValues) {
        this.dividedValues = dividedValues;
    }

    public List<String> parseSymbols() {
        List<String> symbols = new ArrayList<>();
        IntStream.range(0, this.dividedValues.length)
                .filter(this::isOdd)
                .forEach(index -> {
                    validateSymbols(dividedValues[index]);
                    symbols.add(dividedValues[index]);
                });

        return symbols;
    }

    private boolean isOdd(int index) {
        return index % 2 == 1;
    }

    private void validateSymbols(String symbol) {
        if (Arrays.stream(EXPRESSION_SYMBOLS).noneMatch(s -> s.equals(symbol))) {
            throw new IllegalArgumentException("연산자의 위치에 영산자가 아닌, 다른 문자가 입력되었습니다.");
        }
    }

}