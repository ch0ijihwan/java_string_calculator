package model.calulation;

import model.symbol.MathSymbol;

public class Subtraction implements CalculationStrategy {
    @Override
    public int calculate(int x, int y) {
        return x - y;
    }

    @Override
    public boolean hasMathSymbol(MathSymbol mathSymbol) {
        return MathSymbol.MINUS == mathSymbol;
    }
}
