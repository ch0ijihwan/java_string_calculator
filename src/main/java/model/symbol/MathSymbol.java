package model.symbol;

import java.util.Arrays;

public enum MathSymbol {
    PLUS("+"),
    MINUS("-"),
    DIVISION("/"),
    MULTIPLICATION("*");

    private final String symbol;

    MathSymbol(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static MathSymbol of(final String symbol) {
        return Arrays.stream(MathSymbol.values())
                .filter(value -> value.getSymbol().equals(symbol))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("연산자의 형태가 잘못 되었습니다."));
    }

    @Override
    public String toString() {
        return "MathSymbol{" +
                "symbol='" + symbol + '\'' +
                '}';
    }
}
