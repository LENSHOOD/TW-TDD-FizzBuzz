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
- i contains 5, return value cannot include Fizz
- i contains 7 and not contains 3, return value cannot include Buzz
- i contains 7 and contains 3, return Fizz
- others, return itself

### Note
We assume that there is a for-loop outside to iterate 1 to 120, and the code logic only contains the implementation of method fizzBuzz(i).
``` java
for( int i = 0; i < 120; i++) {
    String result = fizzBuzz(i+1);
    System.out.println(result);
}
```

### Record
1. first time
    - 1 h 35 min
2. second time
    - 30 min
3. third ti,e
    - 24min