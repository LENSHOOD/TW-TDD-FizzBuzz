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

    @Test
    public void should_return_whizz_when_multiple_7() {
        assertEquals("Whizz", FizzBuzz.fizzBuzz(14));
    }

    @Test
    public void should_return_fizzbuzz_when_multiple_3_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
    }

    @Test
    public void should_return_buzzwhizz_when_multiple_5_7() {
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(140));
    }

    @Test
    public void should_return_fizzwhizz_when_multiple_3_7() {
        assertEquals("FizzWhizz", FizzBuzz.fizzBuzz(21));
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_multiple_3_5_7() {
        assertEquals("FizzBuzzWhizz", FizzBuzz.fizzBuzz(210));
    }

    @Test
    public void should_return_fizz_when_contains_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(13));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(30));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(33));
    }

    @Test
    public void should_return_result_not_contains_buzz_when_contains_5() {
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(35));
        assertEquals("53", FizzBuzz.fizzBuzz(53));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void should_return_not_contains_buzz_when_contains_7() {
        assertEquals("Whizz", FizzBuzz.fizzBuzz(70));
        assertEquals("Whizz", FizzBuzz.fizzBuzz(175));
        assertEquals("FizzWhizz", FizzBuzz.fizzBuzz(147));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(37));
    }
}
