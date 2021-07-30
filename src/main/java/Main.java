import controller.CalculateController;
import model.evaluation.symbol.Operator;

public class Main {
    public static void main(String[] args) {
        CalculateController calculateController = new CalculateController();
        calculateController.calculate();
        System.out.println(Operator.values());
    }
}
