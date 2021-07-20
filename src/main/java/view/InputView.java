package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String DELIMITER = " ";

    public InputView() {

    }

    public static String[] inputExpression() {
        String value = SCANNER.nextLine();
        return value.split(DELIMITER);
    }
}
