package view;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    private String expressionValue = null;

    public Input() {
        expressionValue = SCANNER.nextLine();
    }
    public String inputExpression() {
        return expressionValue;
    }
}
