package model.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTest {

    @Test
    @DisplayName("숫자 두개를 입력 받으면 덧셈을 하여 값을 반환")
    void Add() {
        //given
        Addition addition = new Addition("1", "2");

        assertThat(addition.Add()).isEqualTo(3);

        //when
        //then
    }

}