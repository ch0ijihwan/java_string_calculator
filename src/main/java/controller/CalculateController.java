package controller;

import model.SendCalculation;
import model.evaluation.Expression;
import model.evaluation.ExpressionValues;
import view.CalculateView;

public class CalculateController {

    CalculateView calculateView;

    public CalculateController() {
        calculateView = new CalculateView();
    }

    public void calculate() {
        ExpressionValues calculateController = new ExpressionValues(calculateView.inputExpression());
        Expression expression = new Expression(calculateController.splitValues());
        SendCalculation sendCalculation = new SendCalculation(
                expression.giveEvaluatedNumbers(),
                expression.giveEvaluatedSymbols()
        );

        calculateView.outResult( sendCalculation.Calculation());
    }


}
