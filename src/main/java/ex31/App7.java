package ex31;
import java.util.*;
import java.lang.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App7
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int restingHR,age;

        Scanner sc=new Scanner(System.in);
        restingHR = sc.nextInt();
        age = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;

        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96)
        {
            int Target = (((220 - age) - restingHR) * intensity) + restingHR;

            System.out.println(intensity+"% | "+Target +"bpm");
            intensity+=5;
        }
    }
}