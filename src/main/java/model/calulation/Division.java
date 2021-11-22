package model.calulation;

import model.symbol.MathSymbol;

public class Division implements CalculationStrategy {
    @Override
    public int calculate(final int x, final int y) {
        if (y == 0) {
            throw new IllegalArgumentException("숫자 0으로는 나눌 수 없습니다.");
        }
        return x / y;
    }

    @Override
    public boolean hasMathSymbol(final MathSymbol mathSymbol) {
        return MathSymbol.DIVISION == mathSymbol;
    }
}
