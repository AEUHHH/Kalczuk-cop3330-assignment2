package ex36;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        String entry = null;

        do
        {
            System.out.println("Enter a number: ");

            entry = input.next();

            if(!entry.equals("done"))
            {
                try
                {
                    int num = Integer.parseInt(entry);
                    numbers.add(num);

                }
                catch(NumberFormatException nfe)
                {
                }
            }
        }
        while(!entry.equals("done"));

        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));

        System.out.println("The average is "+average(numbers));

        System.out.println("The minimum is "+min(numbers));

        System.out.println("The maximum is "+max(numbers));

        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));
    }

    public static double average(ArrayList<Integer> numbers)
    {
        int total = 0;

        for(int num: numbers)
        {
            total += num;
        }
        double avg = (double)(total)/numbers.size();

        return avg;
    }

    public static int max(ArrayList<Integer> numbers)
    {
        int max= numbers.get(0);

        for(int num: numbers)
        {
            if(num > max)
                max = num;
        }
        return max;
    }

    public static int min(ArrayList<Integer> numbers)
    {
        int min= numbers.get(0);

        for(int num: numbers)
        {
            if(num < min)
                min = num;
        }

        return min;
    }

    public static double std(ArrayList<Integer> numbers)
    {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers)
        {
            sum = sum + Math.pow((num-mean), 2);
        }
        double stdDev = Math.sqrt(sum/numbers.size());

        return stdDev;
    }

}