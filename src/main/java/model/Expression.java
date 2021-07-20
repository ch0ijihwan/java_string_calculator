package model;

import java.util.List;

public class Expression {

    private Numbers numbers;
    private Symbols symbols;


    public Expression(String[] dividedValues) {

        numbers = new Numbers(dividedValues);
        symbols = new Symbols(dividedValues);

    }

    public List<String> giveEvaluatedNumbers() {
        return numbers.parseOperands();
    }

    public List<String> giveEvaluatedSymbols() {
        return symbols.parseSymbols();
    }


}
