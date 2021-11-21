package model.calulation;

public class Division implements CalculationStrategy {
    @Override
    public int calculate(int x, int y) {
        return x / y;
    }
}
