package model.calculation;

import model.symbol.MathSymbol;

public class Addition implements Calculation {
    @Override
    public int calculate(final int x, final int y) {
        return x + y;
    }

    @Override
    public boolean hasMathSymbol(final MathSymbol mathSymbol) {
        return MathSymbol.PLUS == mathSymbol;
    }
}
