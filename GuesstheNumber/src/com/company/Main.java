package com.company;

import java.util.Scanner;

class GuesstheNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = 1 + (int)(20 * Math.random());

        int c = 6;

        int i, guess;

        System.out.println("Hello! What is your name?");
        String name = s.nextLine();

        System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.");

        for (i = 0; i < c; i++) {
            System.out.println("Take a guess.");

            guess = s.nextInt();

            try {
                if(guess >= 21);

            }catch (Exception e) {
                System.out.println("You can only choose between 1 and 20.");

            }

            if (num == guess) {
                System.out.println("Good job " + name + "!" + " You guessed my number in " + i + " guesses!");
                System.out.println("Would you like to play again?" + "(y or n)");

                s.nextLine();

                if (s.nextLine() == "y") {
                    System.out.println("Re-run the program to play again.");

                }else if(s.nextLine() == "n")
                    break;
            }
            else if (num > guess && i != c - 1) {
                System.out.println("The number is " + "greater than " + guess + "." +" Try again.");
            }
            else if (num < guess && i != c - 1) {
                System.out.println("The number is" + " less than " + guess + "." + " Try again.");
            }
        }

        if (i == c) {
            System.out.println("You're out of chances, Sorry.");
            System.out.println("The number was " + num);
        }
    }
}

