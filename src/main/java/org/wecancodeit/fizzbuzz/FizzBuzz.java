package org.wecancodeit.fizzbuzz;


import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result;
        int number;
        boolean done = false;
        System.out.println("Please select a number from 1 to 99. " +
                "Enter 0 for help or 100 to exit.");
        while (true) {
            try {
                number = input.nextInt();
                input.nextLine();

                if (number >= 1 && number <= 99) {
                    result = checkNumber(number);
                    System.out.println(result);
                    System.out.println("Please select another number from 1 to 99.");
                } else if (number == 0) {
                    System.out.println("This is the number converter. " +
                            "Numbers divisible by 3 return Fizz. \n" +
                            "Numbers divisible by 5 return Buzz. " +
                            "Numbers divisible by both 3 and 5 return FizzBuzz. \n" +
                            "Numbers divisible only by 11 return Bang. " +
                            "All other numbers will be converted into words. \n" +
                            "Please enter a number between 1 and 99.");
                } else if (number == 100) {
                    System.exit(0);
                } else {
                    System.out.println("Error! Please select a valid number from 1 to 99.");
                }
            } catch (InputMismatchException exception) {
                input.nextLine();
                System.out.println("Error! Please select a valid number from 1 to 99.");
            }
        }
    }

    public static String checkNumber(int number) {

        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        } else if (isBang(number)) {
            return "Bang";
        } else {
            return numberToWord(number);
        }
    }

    public static boolean isFizzBuzz(int number) {
        boolean mod3 = number % 3 == 0;
        boolean mod5 = number % 5 == 0;
        return mod3 && mod5;
    }

    public static boolean isFizz(int number) {
        boolean mod3 = number % 3 == 0;
        return mod3;
    }

    public static boolean isBuzz(int number) {
        boolean mod5 = number % 5 == 0;
        return mod5;
    }

    public static boolean isBang(int number) {
        boolean mod11 = number % 11 == 0;
        return mod11;
    }

    public static String numberToWord(int number) {
        String word;
        if (number < 20) {
            word = underTwenty(number);
            } else {
                String firstWord = getFirstWord(number);
                String lastWord = getLastWord(number);
                word = firstWord + lastWord;
        }
        return word;
    }

    public static String underTwenty(int number) {
        String word;
        switch (number) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 4:
                word = "Four";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 13:
                word = "Thirteen";
                break;
            case 14:
                word = "Fourteen";
                break;
            case 16:
                word = "Sixteen";
                break;
            case 17:
                word = "Seventeen";
                break;
            case 19:
                word = "Nineteen";
                break;
            default:
                word = "";
        }
        return word;
    }

    public static String getFirstWord(int number) {

        int tens = number /= 10;
        String firstWord;
        switch (tens) {
            case 2:
                firstWord = "Twenty";
                break;
            case 3:
                firstWord = "Thirty";
                break;
            case 4:
                firstWord = "Fourty";
                break;
            case 5:
                firstWord = "Fifty";
                break;
            case 6:
                firstWord = "Sixty";
                break;
            case 7:
                firstWord = "Seventy";
                break;
            case 8:
                firstWord = "Eighty";
                break;
            case 9:
                firstWord = "Ninety";
                break;
            default:
                firstWord = "";
        }

        return firstWord;
    }

    public static String getLastWord(int number) {

        int lastNumber = number % 10;
        String lastWord;
        switch (lastNumber) {
            case 1:
                lastWord = "-one";
                break;
            case 2:
                lastWord = "-two";
                break;
            case 3:
                lastWord = "-three";
                break;
            case 4:
                lastWord = "-four";
                break;
            case 5:
                lastWord = "-five";
                break;
            case 6:
                lastWord = "-six";
                break;
            case 7:
                lastWord = "-seven";
                break;
            case 8:
                lastWord = "-eight";
                break;
            case 9:
                lastWord = "-nine";
                break;
            default:
                lastWord = "";
        }
        return lastWord;
    }
}
