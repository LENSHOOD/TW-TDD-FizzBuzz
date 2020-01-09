package zxh.demo.tw.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2020/1/10
*/
public class FizzBuzz {
    public static String fizzBuzz(int input) {
        if (input % 3 ==0 && input % 5 == 0) {
            return "FizzBuzz";
        }

        if (input % 3 == 0) {
            return "Fizz";
        }

        if (input % 5 == 0) {
            return "Buzz";
        }

        if (input % 7 == 0) {
            return "Whizz";
        }

        return null;
    }
}
