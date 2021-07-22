package model.evaluation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ExpressionValuesTest {

    private ExpressionValues expressionValues;

    @Test
    @DisplayName("문자열을 입력받으면 각문자열을 공백 기준으로 쪼개서 배열로 반환하는지 갯수로 확인")
    public void splitValues_size() {
        String value = "1 + 3 - 2 * 1 + 2";
        expressionValues = new ExpressionValues(value);

        assertThat(expressionValues.splitValues().length).isEqualTo(9);
    }

    @Test
    @DisplayName("문자열을 입력받으면 각문자열을 공백 기준으로 쪼개서 배열로 반환하는지 배열로 확인")
    public void splitValues() {
        String value = "1 + 3 - 2";
        expressionValues = new ExpressionValues(value);
        assertThat(Arrays.asList(expressionValues.splitValues())).isEqualTo(Arrays.asList("1", "+", "3", "-", "2"));
    }
}