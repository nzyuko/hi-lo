package com.hilo;

import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	// create a random number for the user to guess
        int theNumber = (int)(Math.random() * 100 + 1);
    //  System.out.println(theNumber);
        int guess = 0;
        while (guess != theNumber) {
            System.out.println("Guess a number between 1 and 100 :");
            guess = scan.nextInt();
            System.out.println("You entered " + guess + ".");
            if (guess > theNumber)
                System.out.println(guess + " is too high try again");
            else if (guess < theNumber)
                System.out.println(guess + " is too low try again");
            else
                System.out.println("You are right YOU WIN!!");
        }
    }
}
