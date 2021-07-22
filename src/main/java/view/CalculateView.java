package view;

import java.util.Scanner;

public class CalculateView {

    private static final Scanner SCANNER = new Scanner(System.in);

    private String expressionValue = null;

    public CalculateView() {
        expressionValue = SCANNER.nextLine();
    }

    public String inputExpression() {

        return expressionValue;
    }
}
