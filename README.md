# KATA-TIME!!!!!

## FizzBuzz

### Description
A timeless classic. One of the origin stories for this kata is that it models a playground game where children took turns saying sequential numbers, but substituting the words Fizz and/or Buzz when the number was a multiple of 3 and/or 5.

This kata is a popular white boarding exercise, to a point where it is almost a white boarding cliche. This kata is great for practicing small steps, writing the most basic code needed to make a unit test pass, and refactoring.

### The tasks

- Write a method that takes an integer and returns a string. This represents the act of saying a number.
- The string should be the numerical characters that represent the value of the integer that was passed, EXCEPT:
  - When the integer passed is a multiple of 3, the method should say Fizz.
  - When the integer passed is a multiple of 5, the method should say Buzz.

There are some variations that are good to implement once you have these basic rules implemented.

- Implement a method that takes a lower boundary integer and a upper boundary integer and return a list of the spoken words from the integers in between those boundaries.
- Practice changing requirements:
  - Change the number associated with Fizz to 4 or another value.
  - Add a third word, "BANG" for multiples of 11.
  - Implement restrictions on the method input, for example limit the integers to positive integers.