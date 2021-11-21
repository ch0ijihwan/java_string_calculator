package view;

import java.util.Scanner;

import static java.lang.System.in;

public class Input {
    private static final String DELIMITER = " ";
    private static final Scanner SCANNER = new Scanner(in);

    private Input() {}

    public static String[] inputExpression() {
        String value = SCANNER.nextLine();
        return value.split(DELIMITER);
    }
}
