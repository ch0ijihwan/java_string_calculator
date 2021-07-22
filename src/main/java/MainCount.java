import controller.CalculateController;
import model.Expression;
import model.SendCalculation;
import view.CalculateView;

public class MainCount {
    public static void main(String[] args) {

        CalculateView calculateView = new CalculateView();
        CalculateController calculateController = new CalculateController (calculateView.inputExpression());
        Expression expression = new Expression(calculateController.splitValues());
        SendCalculation sendCalculation = new SendCalculation(
                expression.giveEvaluatedNumbers(),
                expression.giveEvaluatedSymbols()
        );
        System.out.println(sendCalculation.Calculation());
    }
}
