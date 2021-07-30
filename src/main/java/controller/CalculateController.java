package controller;

import model.Calculation;
import model.evaluation.Expression;
import model.evaluation.ExpressionValues;
import view.Input;
import view.OutReuslt;

public class CalculateController {

    Input input;

    public CalculateController() {
        input = new Input();
    }

    public void calculate() {
        ExpressionValues calculateController = new ExpressionValues(input.inputExpression());
        Expression expression = new Expression(calculateController.splitValues());
        Calculation sendCalculation = new Calculation(
                expression.getEvaluatedNumbers(), expression.getEvaluatedOperators()
        );
        sendCalculation.calculate();
        new OutReuslt(sendCalculation.outResult());
    }
}
