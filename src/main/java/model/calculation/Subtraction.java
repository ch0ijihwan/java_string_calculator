package model.calculation;

import model.symbol.MathSymbol;

public class Subtraction implements Calculation {
    @Override
    public int calculate(final int x, final int y) {
        return x - y;
    }

    @Override
    public boolean hasMathSymbol(MathSymbol mathSymbol) {
        return MathSymbol.MINUS == mathSymbol;
    }
}
