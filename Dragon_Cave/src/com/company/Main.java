package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

class Dragon_Cave {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        int userinput = s.nextInt();

        try {
            if(s.nextInt() != 1 || s.nextInt() != 2);

        } catch (Exception ex) {
            System.out.println("You can only choose either 1 or 2. Try again.");
        }

        if (userinput == 1){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");

        } else if (userinput == 2){
            System.out.println("You enter a cave with a light in the back...");
            System.out.println("The light keeps getting brighter the more you walk deeper into the cave...");
            System.out.println("You meet the friendlt dragon inside the cave and gives you a treasure chest full of gold and gems");
            System.out.println("Now, you're rich and wealthy beyond your lifestyle!");
        }

    }

}
