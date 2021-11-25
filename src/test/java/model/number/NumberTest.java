package model.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {

    @Test
    @DisplayName("객체 생성시, 생성자의 파라미터로 부터 입력 받은 String 값이 숫자인 경우 이를 저장한다.")
    void createNumber1() {
        //given
        String inputNumber = "1";

        //when
        Number actualNumber = new Number(inputNumber);

        //then
        assertThat(actualNumber).isEqualTo(new Number(inputNumber));
    }

    @Test
    @DisplayName("객체 생성시, 생성자의 파라미터로 부터 입력 받은 int 형 숫자를 저장한다.")
    void createNumber2() {
        //given
        int inputNumber = 1;

        //when
        Number actualNumber = new Number(inputNumber);

        //then
        assertThat(actualNumber).isEqualTo(new Number(inputNumber));
    }

    @Test
    @DisplayName("객체 생성시 입력 받은, String 값이 숫자가 아닌 경우 예외처리를 반환한다.")
    void validateInteger() {
        //given
        String input = "a";

        assertThatThrownBy(() -> new Number(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 아닙니다.");
    }

    @Test
    @DisplayName("getValue() 호출 시, 객체에 저장된 값을 int 형태로 반환한다.")
    void getNumber() {
        //given
        int inputNumber = 1;
        Number number = new Number(inputNumber);
        int expectedNumber = 1;

        //when
        int actualNumber = number.getValue();

        //then
        assertThat(actualNumber).isEqualTo(expectedNumber);
    }
}
