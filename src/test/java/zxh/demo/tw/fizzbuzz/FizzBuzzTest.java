package zxh.demo.tw.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2020/1/11
*/
public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_multiple_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void should_return_buzz_when_multiple_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
}
