package model;

import model.calulation.CalculationStrategy;
import model.symbol.MathSymbol;

public class Calculator {
    private int result;

    public int getResult() {
        return result;
    }

    public Calculator(final Expression expression) {
        int remainingCalculationCount = expression.getMathSymbolsSize();
        result = expression.nextNumber();
        while (remainingCalculationCount != 0) {
            MathSymbol mathSymbol = expression.nextMathSymbol();
            int nextNumber = expression.nextNumber();
            CalculationStrategy calculationStrategy = MathSymbolFinder.findStrategy(mathSymbol);
            result = calculationStrategy.calculate(result, nextNumber);
            remainingCalculationCount--;
        }
    }
}
