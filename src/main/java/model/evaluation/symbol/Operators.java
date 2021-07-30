package model.evaluation.symbol;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operators {
    private List<Operator> operators;

    public Operators(String[] dividedValues) {
        operators = this.operators = IntStream.range(0, dividedValues.length)
                .filter(this::isOdd)
                .mapToObj(index -> Operator.of(dividedValues[index]))
                .collect(Collectors.toList());
    }
    private boolean isOdd(int index) {
        return index % 2 == 1;
    }

    public String getOperator(int index) {
        return this.operators.get(index).getSymbol();
    }

    public List<Operator> getEvaluatedOperators(){
        return this.operators;
    }
}