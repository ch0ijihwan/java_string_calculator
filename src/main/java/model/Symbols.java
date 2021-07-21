package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Symbols {
    private static final String[] EXPRESSION_SYMBOLS = {"+", "-", "*", "/"};
    private static final String NUMBER_REGEX = "^[0-9]*$";
    private static final Pattern NUMBER_PATTERN = Pattern.compile(NUMBER_REGEX);

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
            throw new IllegalArgumentException("연산자가 매우 이상합니다.");
        }
    }

}