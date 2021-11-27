package model;

import model.calculation.*;
import model.symbol.MathSymbol;

import java.util.Arrays;
import java.util.List;

public class MathSymbolFinder {
    private static final List<Calculation> CALCULATION_STRATEGIES
            = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Division());

    private MathSymbolFinder() {
    }

    public static Calculation findStrategy(final MathSymbol mathSymbol) {
        return CALCULATION_STRATEGIES.stream()
                .filter(calculationStrategy -> calculationStrategy.hasMathSymbol(mathSymbol))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("연산자가 이상합니다."));
    }
}
