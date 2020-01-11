package zxh.demo.tw.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2020/1/11
*/
public class FizzBuzz {
    public static String fizzBuzz(int i) {
        String result = "";

        if (isMultipleOf3(i)) {
            result +=  "Fizz";
        }

        if (isMultipleOf5(i)) {
            result +=  "Buzz";
        }

        if (isMultipleOf7(i)) {
            result +=  "Whizz";
        }

        if (isContains7(i)) {
            result = result.replace("Buzz", "");
            if (isContains3(i)) {
                result = "Fizz";
            }
            return getResult(result, i);
        }

        if (isContains5(i)) {
            result = result.replace("Fizz", "");
            return getResult(result, i);
        }

        if (isContains3(i)) {
            return "Fizz";
        }

        return result;
    }

    private static String getResult(String result, int defaultNumber) {
        if (result.length() == 0) {
            return String.valueOf(defaultNumber);
        }
        return result;
    }

    private static boolean isContains7(int i) {
        return isContains(i, "7");
    }

    private static boolean isContains5(int i) {
        return isContains(i, "5");
    }

    private static boolean isContains3(int i) {
        return isContains(i, "3");
    }

    private static boolean isContains(int i, String s) {
        return String.valueOf(i).contains(s);
    }

    private static boolean isMultipleOf7(int i) {
        return isMultipleOf(i, 7);
    }

    private static boolean isMultipleOf5(int i) {
        return isMultipleOf(i, 5);
    }

    private static boolean isMultipleOf3(int i) {
        return isMultipleOf(i, 3);
    }

    private static boolean isMultipleOf(int i, int i2) {
        return i % i2 == 0;
    }
}
