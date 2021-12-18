package controller;

import model.Expression;
import view.Display;
import view.Input;

public class Controller {
    public void run() {
        String[] tokens = Input.inputExpression();
        Expression expression = new Expression(tokens);
        Display.showResult(expression.getAnswer());
    }
}
