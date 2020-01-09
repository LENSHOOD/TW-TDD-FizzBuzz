package zxh.demo.tw.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2020/1/10
*/
public class FizzBuzz {
    public static String fizzBuzz(int input) {
        if (isMultipleOf3(input) && isMultipleOf5(input)) {
            return "FizzBuzz";
        }

        if (isMultipleOf3(input)) {
            return "Fizz";
        }

        if (isMultipleOf5(input)) {
            return "Buzz";
        }

        if (isMultipleOf7(input)) {
            return "Whizz";
        }

        return null;
    }

    private static boolean isMultipleOf7(int input) {
        return input % 7 == 0;
    }

    private static boolean isMultipleOf5(int input) {
        return input % 5 == 0;
    }

    private static boolean isMultipleOf3(int input) {
        return input % 3 ==0;
    }
}
