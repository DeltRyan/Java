// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
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
        System.out.println("What is your sibling birth year? ");
        int yearSibling = myObj.nextInt();

        int ageDifference = age - (currentYear - yearSibling);
        double ageDifferenceTimes;

        if (ageDifference > 0) {
            System.out.print("You are ");
            System.out.print(ageDifference);
            System.out.println(" years older than your sibling");

            ageDifferenceTimes = (double)age / (currentYear - yearSibling);
            ageDifferenceTimes = Math.round(ageDifferenceTimes * 100.0) / 100.0;
            System.out.print("You are ");
            System.out.print(ageDifferenceTimes);
            System.out.println(" times older than your sibling");
        }
        if (ageDifference == 0) {
            System.out.print("You are the same age as your sibling");
        }
        if (ageDifference < 0) {
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

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        }
    }