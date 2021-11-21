package model.calulation;

import model.symbol.MathSymbol;

public class Division implements CalculationStrategy {
    @Override
    public int calculate(int x, int y) {
        return x / y;
    }

    @Override
    public boolean hasMathSymbol(final MathSymbol mathSymbol) {
        return MathSymbol.DIVISION == mathSymbol;
    }
}
