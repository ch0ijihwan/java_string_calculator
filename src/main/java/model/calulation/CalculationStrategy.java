package model.calulation;

import model.symbol.MathSymbol;

public interface CalculationStrategy {
    int calculate(final int x, final int y);

    boolean hasMathSymbol(final MathSymbol mathSymbol);
}
