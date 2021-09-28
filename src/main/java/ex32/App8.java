package ex32;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

class App8
{
    public static void main(String[] args)
    {
        System.out.println("Let's play Guess the Number!");
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,total=0,key;

        while(true){

            total=0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();

            if(key==1)
                secretNumber = (int) (Math.random() * 10 + 1);
            else if(key==2)
                secretNumber = (int) (Math.random() * 100 + 1);
            else
                secretNumber = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do
            {
                guess = sc.nextInt();
                total++;

                if (guess == secretNumber)
                {
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < secretNumber)
                    System.out.println("Too low. Guess again: ");

                else if (guess > secretNumber)
                    System.out.println("Too high. Guess again: ");

                else if (guess != (int)guess)
                    System.out.println("Only numerical values are allowed. Guess again: ");

            }
            while (guess != secretNumber);

            System.out.print("\nDo you wish to play again (Y/N)?  ");

            char s=sc.next().charAt(0);

            if(s=='N' || s=='n')
                break;
        }

    }
}
