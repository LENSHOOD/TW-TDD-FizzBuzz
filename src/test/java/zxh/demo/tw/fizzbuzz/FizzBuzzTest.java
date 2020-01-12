package zxh.demo.tw.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2020/1/12
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
        assertEquals("Whizz", FizzBuzz.fizzBuzz(70));
    }

    @Test
    public void should_return_fizzwhizz_when_multiple_3_7() {
        assertEquals("FizzWhizz", FizzBuzz.fizzBuzz(21));
    }

    @Test
    public void should_return_buzzwhizz_when_multiple_3_5_7() {
        assertEquals("FizzBuzzWhizz", FizzBuzz.fizzBuzz(210));
    }

    @Test
    public void should_return_fizz_when_contains_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(13));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(63));
    }

    @Test
    public void should_return_not_contains_fizz_when_contains_5() {
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(35));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(15));
        assertEquals("BuzzWhizz", FizzBuzz.fizzBuzz(105));
    }

    @Test
    public void should_return_not_contains_buzz_when_contains_7() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(37));
        assertEquals("Whizz", FizzBuzz.fizzBuzz(70));
    }

    @Test
    public void should_return_itself_when_others_case() {
        assertEquals("53", FizzBuzz.fizzBuzz(53));
        assertEquals("17", FizzBuzz.fizzBuzz(17));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
    }
}
