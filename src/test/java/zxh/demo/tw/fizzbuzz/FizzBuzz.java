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
            if (result.length() == 0) {
                return String.valueOf(i);
            }
            return result;
        }

        if (isContains5(i)) {
            result = result.replace("Fizz", "");
            if (result.length() == 0) {
                return String.valueOf(i);
            }
            return result;
        }

        if (isContains3(i)) {
            return "Fizz";
        }

        return result;
    }

    private static boolean isContains7(int i) {
        return String.valueOf(i).contains("7");
    }

    private static boolean isContains5(int i) {
        return String.valueOf(i).contains("5");
    }

    private static boolean isContains3(int i) {
        return String.valueOf(i).contains("3");
    }

    private static boolean isMultipleOf7(int i) {
        return i % 7 == 0;
    }

    private static boolean isMultipleOf5(int i) {
        return i % 5 == 0;
    }

    private static boolean isMultipleOf3(int i) {
        return i % 3 == 0;
    }
}
