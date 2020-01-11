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

        return result;
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
