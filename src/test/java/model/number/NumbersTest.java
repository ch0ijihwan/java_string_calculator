package model.number;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

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
        assertThat(numbers).isEqualTo(new Numbers(expected));
    }

    @Test
    @DisplayName("poll() 호출 시, 리스트의 제일 앞 값을 삭제하고, 값을 반환한다.")
    void poll() {
        //given
        List<String> inputtedExpression = Arrays.asList("1", "+", "3", "-", "2");
        Numbers numbers = new Numbers(inputtedExpression);
        int expectedNumber = 1;
        Numbers expectedNumbers = new Numbers(Arrays.asList("3", "2"));

        //when
        int actualNumber = numbers.poll();

        //then
        assertAll(
                () -> assertThat(actualNumber).isEqualTo(expectedNumber),
                () -> assertThat(numbers).isEqualTo(expectedNumbers)
        );
    }
}
