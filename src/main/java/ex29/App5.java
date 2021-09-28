package ex29;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(sc.next());

                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag=true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag) //if exception not raised
            {
                break;
            }

        }
    }
}