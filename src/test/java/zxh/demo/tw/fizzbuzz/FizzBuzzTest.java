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
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(70));
    }

    @Test
    public void should_return_fizzwhizz_when_input_multiple_3_7() {
        assertEquals("FizzWhizz", FizzBuzz.fizzBuzz(21));
    }

    @Test
    public void should_fizzbuzzwhizz_when_input_multiple_of_3_5_7() {
        assertEquals("FizzBuzzWhizz", FizzBuzz.fizzBuzz(105));
    }

    @Test
    public void should_return_fizz_when_input_contains_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(13));
    }

    @Test
    public void should_return_fizz_when_input_contains_3_and_multiple_of_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(33));
    }

    @Test
    public void should_return_fizz_when_input_contains_3_and_multiple_of_5() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(135));
    }

    @Test
    public void should_return_fizz_when_input_contains_3_and_multiple_of_7() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(63));
    }

    @Test
    public void should_return_fizz_when_input_contains_3_and_multiple_of_5_7() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(35));
    }
}
