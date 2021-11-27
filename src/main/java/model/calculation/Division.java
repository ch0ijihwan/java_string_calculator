package model.calculation;

import model.symbol.MathSymbol;

public class Division implements Calculation {
    private static final int ZERO = 0;

    @Override
    public int calculate(final int x, final int y) {
        validateDivisor(y);
        return x / y;
    }

    @Override
    public boolean hasMathSymbol(final MathSymbol mathSymbol) {
        return MathSymbol.DIVISION == mathSymbol;
    }

    private void validateDivisor(int dividedNumber) {
        if (dividedNumber == ZERO) {
            throw new IllegalArgumentException("숫자 0으로는 나눌 수 없습니다.");
        }
    }
}
