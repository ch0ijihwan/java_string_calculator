package model.calulation;

public class Subtraction implements CalculationStrategy {
    @Override
    public int calculate(int x, int y) {
        return x - y;
    }
}
