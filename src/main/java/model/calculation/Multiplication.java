package model.calculation;

import model.symbol.MathSymbol;

public class Multiplication implements Calculation {
    @Override
    public int calculate(final int x, final int y) {
        return x * y;
    }

    @Override
    public boolean hasMathSymbol(MathSymbol mathSymbol) {
        return MathSymbol.MULTIPLICATION == mathSymbol;
    }
}
