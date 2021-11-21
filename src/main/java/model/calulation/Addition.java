package model.calulation;

import model.symbol.MathSymbol;

public class Addition implements CalculationStrategy {
    @Override
    public int calculate(final int x, final int y) {
        return x + y;
    }

    @Override
    public boolean hasMathSymbol(final MathSymbol mathSymbol) {
        return MathSymbol.PLUS == mathSymbol;
    }
}
