package model.number;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {
    @Test
    @DisplayName("객체 생성시, 생성자의 파라미터로 부터 입력받은 리스트 값들 중 짝수 번째 인덱스 값들을 Number 객체화 하여 Queue 형태로 저장한다.")
    void createNumbers() {
        //given
        List<String> inputExpression = Arrays.asList("1", "+", "2");
        List<String> expected = Arrays.asList("1", " ", "2");

        //when
        Numbers numbers = new Numbers(inputExpression);

        //then
        assertThat(numbers).isEqualTo(new Numbers(expected));
    }
}
