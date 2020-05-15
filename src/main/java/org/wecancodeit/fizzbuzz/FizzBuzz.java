package org.wecancodeit.fizzbuzz;


import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the FizzBuzz game. Let's get started!");
        gameSetup(input);
    }

    public static void gameSetup(Scanner input) {

        String firstWord = pickFirstWord(input);
        System.out.println("Fizz has been changed to " + firstWord);

        String secondWord = pickSecondWord(input);
        System.out.println("Buzz has been changed to " + secondWord);

        System.out.println("FizzBuzz has been changed to " + firstWord + secondWord);

        String thirdWord = pickThirdWord(input);
        System.out.println("Bang has been changed to " + thirdWord);

        int firstNumber = pickFirstNumber(input, firstWord);
        while (firstNumber < 1 || firstNumber > 9) {
            firstNumber = pickFirstNumber(input, firstWord);
        }
        System.out.println("Numbers divisible by " + firstNumber + " will return " + firstWord);

        int secondNumber = pickSecondNumber(input, secondWord, firstNumber);
        while (secondNumber < 1 || secondNumber > 9 || firstNumber == secondNumber) {
            secondNumber = pickSecondNumber(input, secondWord, firstNumber);
        }
        System.out.println("Numbers divisible by " + secondNumber + " will return " + secondWord);

        System.out.println("Numbers divisible by " + firstNumber + " and " + secondNumber +
                " will return " + firstWord + secondWord);

        int thirdNumber = pickThirdNumber(input, thirdWord);
        while (thirdNumber < 10 || thirdNumber > 15) {
            thirdNumber = pickThirdNumber(input, thirdWord);
        }
        System.out.println("Numbers divisible by " + thirdNumber + " will return " + thirdWord);

        gameLoop(input, firstWord, firstNumber, secondWord, secondNumber, thirdWord, thirdNumber);
    }

    public static int pickFirstNumber(Scanner input, String firstWord) {
        System.out.println("Please pick a number 1-9 for " + firstWord);
        int number = input.nextInt();
        input.nextLine();

        return number;
    }

    public static int pickSecondNumber(Scanner input, String secondWord, int firstNumber) {
        System.out.println("Please pick a number 1-9 for " + secondWord +
            ". Cannot be " + firstNumber + ".");
        int number = input.nextInt();
        input.nextLine();

        return number;
    }

    public static int pickThirdNumber(Scanner input, String thirdWord) {
        System.out.println("Please pick a number 10-15 for " + thirdWord);
        int number = input.nextInt();
        input.nextLine();

        return number;
    }

    public static String pickFirstWord(Scanner input) {
        System.out.println("Pick a word to use instead of Fizz.");
        return input.nextLine();
    }

    public static String pickSecondWord(Scanner input) {
        System.out.println("Pick a word to use instead of Buzz.");
        return input.nextLine();
    }

    public static String pickThirdWord(Scanner input) {
        System.out.println("Pick a word to use instead of Bang.");
        return input.nextLine();
    }

    public static void gameLoop(Scanner input, String firstWord, int firstNumber, String secondWord, int secondNumber, String thirdWord, int thirdNumber) {
        while (true) {
            int number;
            String result;
            try {
                number = input.nextInt();
                input.nextLine();

                if (number >= 1 && number <= 99) {
                    result = checkNumber(number, firstWord, firstNumber, secondWord, secondNumber, thirdWord, thirdNumber);
                    System.out.println(result);
                    System.out.println("Please select another number from 1 to 99.");
                } else if (number == 0) {
                    getHelp();
                } else if (number == 100) {
                    System.out.println("Game over. Thank you for playing.");
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

    public static void getHelp() {

        System.out.println("This is the number converter. " +
                            "Numbers divisible by 3 return Fizz. \n" +
                            "Numbers divisible by 5 return Buzz. " +
                            "Numbers divisible by both 3 and 5 return FizzBuzz. \n" +
                            "Numbers divisible only by 11 return Bang. " +
                            "All other numbers will be converted into words. \n" +
                            "Please enter a number between 1 and 99 or 100 to exit.");
    }

    public static String checkNumber(int number, String firstWord, int firstNumber, String secondWord, int secondNumber, String thirdWord, int thirdNumber) {

        if (isFizzBuzz(number, firstNumber, secondNumber)) {
            return firstWord + secondWord;
        } else if (isFizz(number, firstNumber)) {
            return firstWord;
        } else if (isBuzz(number, secondNumber)) {
            return secondWord;
        } else if (isBang(number, thirdNumber)) {
            return thirdWord;
        } else {
            return numberToWord(number);
        }
    }

    public static boolean isFizzBuzz(int number, int firstNumber, int secondNumber) {
        boolean mod3 = number % 3 == 0;
        boolean mod5 = number % 5 == 0;
        return mod3 && mod5;
    }

    public static boolean isFizz(int number, int firstNumber) {
        boolean mod = number % firstNumber == 0;
        return mod;
    }

    public static boolean isBuzz(int number, int secondNumber) {
        boolean mod = number % secondNumber == 0;
        return mod;
    }

    public static boolean isBang(int number, int thirdNumber) {
        boolean mod = number % thirdNumber == 0;
        return mod;
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
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            case 10:
                word = "Ten";
                break;
            case 11:
                word = "Eleven";
                break;
            case 12:
                word = "Twelve";
                break;
            case 13:
                word = "Thirteen";
                break;
            case 14:
                word = "Fourteen";
                break;
            case 15:
                word = "Fifteen";
                break;
            case 16:
                word = "Sixteen";
                break;
            case 17:
                word = "Seventeen";
                break;
            case 18:
                word = "Eighteen";
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
