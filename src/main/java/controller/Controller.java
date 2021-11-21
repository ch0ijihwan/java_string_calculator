package controller;

import model.Calculator;
import model.Expression;
import view.Display;
import view.Input;

public class Controller {
    public Controller() {
        String[] tokens = Input.inputExpression();
        Expression expression = new Expression(tokens);
        Calculator calculator = new Calculator(expression);
        Display.showResult(calculator.getResult());
    }
}
