package model.calulation;

public class Addition implements CalculationStrategy {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
