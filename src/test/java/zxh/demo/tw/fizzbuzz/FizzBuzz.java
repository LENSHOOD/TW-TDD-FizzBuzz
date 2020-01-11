package zxh.demo.tw.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2020/1/11
*/
public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            return "FizzBuzzWhizz";
        }

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 5 == 0 && i % 7 == 0) {
            return "BuzzWhizz";
        }

        if (i % 3 == 0 && i % 7 == 0) {
            return "FizzWhizz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }

        if (i % 7 == 0) {
            return "Whizz";
        }

        return null;
    }
}
