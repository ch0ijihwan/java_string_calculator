package model.calulation;

public class Multiplication implements CalculationStrategy {
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
