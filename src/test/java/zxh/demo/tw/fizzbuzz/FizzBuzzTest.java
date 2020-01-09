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
    
    @Test
    public void should_return_buzz_when_input_multiple_of_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));
    }

    @Test
    public void should_return_whizz_when_input_multiple_of_7() {
        assertEquals("Whizz", FizzBuzz.fizzBuzz(28));
    }

    @Test
    public void should_return_fizzbuzz_when_input_multiple_3_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void should_return_buzzwhizz_when_input_multiple_5_7() {
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(35));
    }

    @Test
    public void should_return_fizzwhizz_when_input_multiple_3_7() {
        assertEquals("FizzWhizz", FizzBuzz.fizzBuzz(21));
    }
}
