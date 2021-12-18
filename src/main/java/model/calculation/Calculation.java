package model.calculation;

import model.symbol.MathSymbol;

public interface Calculation {
    int calculate(final int x, final int y);

    boolean hasMathSymbol(final MathSymbol mathSymbol);
}
