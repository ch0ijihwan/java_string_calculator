package model;

import model.calulation.*;
import model.symbol.MathSymbol;

import java.util.Arrays;
import java.util.List;

public class MathSymbolFinder {
    private static final List<CalculationStrategy> CALCULATION_STRATEGIES
            = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Division());

    private MathSymbolFinder() {
    }

    public static CalculationStrategy findStrategy(final MathSymbol mathSymbol) {
        return CALCULATION_STRATEGIES.stream()
                .filter(calculationStrategy -> calculationStrategy.hasMathSymbol(mathSymbol))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("연산자가 이상합니다."));
    }
}
