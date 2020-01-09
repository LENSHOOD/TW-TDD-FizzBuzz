package zxh.demo.tw.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2020/1/10
*/
public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public static String fizzBuzz(int input) {
        String result = "";

        if (isMultipleOf3(input)) {
            result += FIZZ;
        }

        if (isMultipleOf5(input)) {
            result += BUZZ;
        }

        if (isMultipleOf7(input)) {
            result += WHIZZ;
        }

        if (isContains7(input)) {
            result = result.replace(BUZZ, "");
            if (isContains3(input)) {
                return FIZZ;
            }

            return result;
        }

        if (isContains5(input)) {
            return result.replace(FIZZ, "");
        }

        if (isContains3(input)) {
            return FIZZ;
        }

        if (result.length() == 0) {
            return String.valueOf(input);
        }

        return result;
    }

    private static boolean isContains5(int input) {
        return String.valueOf(input).contains("5");
    }

    private static boolean isContains3(int input) {
        return String.valueOf(input).contains("3");
    }

    private static boolean isContains7(int input) {
        return String.valueOf(input).contains("7");
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
