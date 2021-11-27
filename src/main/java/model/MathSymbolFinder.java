package model;

import model.calculation.*;
import model.symbol.MathSymbol;

import java.util.EnumMap;
import java.util.Map;

public class MathSymbolFinder {
    private static final Map<MathSymbol, Calculation> CALCULATION_STRATEGIES = new EnumMap<>(MathSymbol.class);
    static {
        CALCULATION_STRATEGIES.put(MathSymbol.PLUS, new Addition());
        CALCULATION_STRATEGIES.put(MathSymbol.MINUS, new Subtraction());
        CALCULATION_STRATEGIES.put(MathSymbol.MULTIPLICATION, new Multiplication());
        CALCULATION_STRATEGIES.put(MathSymbol.DIVISION, new Division());
    }

    private MathSymbolFinder() {
    }

    public static Calculation findStrategy(final MathSymbol mathSymbol) {
        return CALCULATION_STRATEGIES.get(mathSymbol);
    }
}
