package model.calulation;

import model.symbol.MathSymbol;

public interface CalculationStrategy {
    int calculate(int x, int y);
    boolean hasMathSymbol(final MathSymbol mathSymbol);
}
