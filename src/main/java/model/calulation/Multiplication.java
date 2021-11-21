package model.calulation;

import model.symbol.MathSymbol;

public class Multiplication implements CalculationStrategy {
    @Override
    public int calculate(final int x, final int y) {
        return x * y;
    }

    @Override
    public boolean hasMathSymbol(MathSymbol mathSymbol) {
        return MathSymbol.MULTIPLICATION == mathSymbol;
    }
}
