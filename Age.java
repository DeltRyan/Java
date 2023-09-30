import java.util.Scanner;

public class Age
{
    private int currentYear;
    private int yearSibling;

    public void start ()
    {
        System.out.println("Hello and welcome!");

        System.out.println();
        Scanner myObj = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = myObj.nextInt();

        System.out.println("What year is it now? ");
        int currentYear = myObj.nextInt();

        int birthYear = currentYear - age;
        System.out.print("You were born in ");
        System.out.println(birthYear);

        System.out.println();
        System.out.println("What is your sibling's birth year? ");
        int yearSibling = myObj.nextInt();

        new Age(currentYear, birthYear, yearSibling);
    }
    public Age()
    {
        start();
    }
    public Age(int currentYear, int birthYear, int yearSibling)
    {
        int age = currentYear - birthYear;
        int ageSib = currentYear - yearSibling;
        int ageDifference = age - ageSib;
        this.currentYear = currentYear;
        this.yearSibling = yearSibling;
        older(ageDifference, age);
    }
    public void older(int ageDifference, int age)
    {
        double ageDifferenceTimes;
        if (ageDifference > 0)
        {
            System.out.print("You are ");
            System.out.print(ageDifference);
            System.out.println(" years older than your sibling");

            ageDifferenceTimes = (double)age / (currentYear - yearSibling);
            ageDifferenceTimes = Math.round(ageDifferenceTimes * 100.0) / 100.0;
            System.out.print("You are ");
            System.out.print(ageDifferenceTimes);
            System.out.println(" times older than your sibling");
        }
        if (ageDifference == 0)
        {
            System.out.print("You are the same age as your sibling");
        }
        if (ageDifference < 0)
        {
            System.out.print("You are ");
            ageDifference = ageDifference * -1;
            System.out.print(ageDifference);
            System.out.println(" years younger than your sibling");

            ageDifferenceTimes = (double)(currentYear - yearSibling) / age;
            ageDifferenceTimes = Math.round(ageDifferenceTimes * 100.0) / 100.0;
            System.out.print("You are ");
            System.out.print(ageDifferenceTimes);
            System.out.println(" times younger than your sibling");
        }
    }
}

