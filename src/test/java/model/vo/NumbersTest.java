package model.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumbersTest {
    @Test
    @DisplayName("생성자로부터 식을 입력 받으면, 이중 숫자만 Number 형태의 리스트로 저장한다.")
    void createNumbers() {
        //given
        List<String> inputExpression = Arrays.asList("1", "+", "2");
        List<String> expected = Arrays.asList("1", "2");

        //when
        Numbers numbers = new Numbers(inputExpression);

        //then
        assertThat(numbers).isEqulTo(new Numbers(expected));
    }
}
