package ex39;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App15
{
    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer",00000000),
                new Employee("Jacquelyn", "Jackson", "DBA",00000000),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

        List<Employee> list = Arrays.asList(employees);

        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);
    }
}
class Employee
{
    private String firstName;
    private String lastName;

    private String department;
    private double separationDate;

    public Employee(String firstName, String lastName,
                    String department,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate=separationDate;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }


    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setseparationDate(double separationDate)
    {
        this.separationDate = separationDate;
    }


    public double getseparationDate()
    {
        return separationDate;
    }

    public String getName()
    {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    @Override
    public String toString()
    {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getseparationDate());
    }
}
