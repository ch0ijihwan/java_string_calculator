package controller;

import model.SendCalculation;
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
        SendCalculation sendCalculation = new SendCalculation(
                expression.giveEvaluatedNumbers(),
                expression.giveEvaluatedSymbols()
        );
        new OutReuslt(sendCalculation.Calculation());
    }

}
