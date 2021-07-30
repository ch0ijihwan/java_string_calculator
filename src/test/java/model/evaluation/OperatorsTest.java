package model.evaluation;

import model.evaluation.symbol.Operators;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OperatorsTest {

    private Operators operators;

    @Test
    @DisplayName("식을 입력 받으면 연산자를 반환하는지 평가")
    public void parseSymbols() {
        operators = new Operators(new String[]{"1", "+", "1", "-", "2"});
        assertThat(operators.getEvaluatedOperators().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("식을 입력 받을 때 잘못된 기호가 입력되면 예외처리를 하는지 평가")
    public void parseSymbols_exception() throws IllegalArgumentException {

        assertThrows(IllegalArgumentException.class, () ->operators = new Operators(new String[]{"1", "&", "1", "-", "2"}));
    }
}