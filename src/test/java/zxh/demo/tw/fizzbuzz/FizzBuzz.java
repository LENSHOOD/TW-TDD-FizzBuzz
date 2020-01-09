package zxh.demo.tw.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2020/1/10
*/
public class FizzBuzz {
    public static String fizzBuzz(int input) {
        if (String.valueOf(input).contains("7")) {
            if (String.valueOf(input).contains("3")) {
                return "Fizz";
            } else if (isMultipleOf3(input) && isMultipleOf7(input)) {
                return "FizzWhizz";
            } else if (isMultipleOf7(input)) {
                return "Whizz";
            } else if (isMultipleOf3(input)) {
                return "Fizz";
            }
        }

        if (String.valueOf(input).contains("5")) {
            if (isMultipleOf5(input) && isMultipleOf7(input)) {
                return "BuzzWhizz";
            } else if (isMultipleOf7(input)) {
                return "Whizz";
            } else if (isMultipleOf5(input)) {
                return "Buzz";
            }
        }

        if (String.valueOf(input).contains("3")) {
            return "Fizz";
        }

        if (isMultipleOf3(input) && isMultipleOf5(input) && isMultipleOf7(input)) {
            return "FizzBuzzWhizz";
        }

        if (isMultipleOf3(input) && isMultipleOf5(input)) {
            return "FizzBuzz";
        }

        if (isMultipleOf5(input) && isMultipleOf7(input)) {
            return "BuzzWhizz";
        }

        if (isMultipleOf3(input) && isMultipleOf7(input)) {
            return "FizzWhizz";
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
