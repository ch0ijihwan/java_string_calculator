package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberTest {
    @Test
    @DisplayName("객체 생성시, 생성자의 파라미터로 부터 입력 받은 숫자를 저장한다.")
    void createNumber() {
        //given
        int inputNumber = 1;

        //when
        Number actualNumber = new Number(inputNumber);

        //then
        assertThat(actualNumber).isEqualTo(new Number(inputNumber));
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
