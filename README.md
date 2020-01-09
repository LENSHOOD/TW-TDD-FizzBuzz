# TW-TDD-FizzBuzz
TW TDD Training Lesson 1 - FizzBuzz

### Tasking
- i is multiple of 3, return Fizz
- i is multiple of 5, return Buzz
- i is multiple of 7, return Whizz
- i is multiple of both 3 and 5, return FizzBuzz
- i is multiple of both 5 and 7, return BuzzWhizz
- i is multiple of both 7 and 3, return FizzWhizz
- i is multiple of 3, 5 and 7, return FizzBuzzWhizz
- i contains 3, return Fizz
- i contains 3, multiple of any number, return Fizz
- i contains 5 and multiple of 5, return Buzz
- i contains 5 and multiple of 7, return Whizz
- i contains 5 and multiple of 5 and 7, return BuzzWhizz
- i contains 7 and multiple of 3, return Fizz
- i contains 7 and multiple of 7, return Whizz
- i contains 7 and multiple of 3 and 7, return FizzWhizz
- i contains 7 and contains 3, return Fizz

### Note
We assume that there is a for-loop outside to iterate 1 to 120, and the code logic only contains the implementation of method fizzBuzz(i).
``` java
for( int i = 0; i < 120; i++) {
    String result = fizzBuzz(i+1);
    System.out.println(result);
}
```
