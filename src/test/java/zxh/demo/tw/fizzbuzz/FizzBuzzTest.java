package zxh.demo.tw.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2020/1/9
*/
public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_input_multiple_of_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
    }
}
