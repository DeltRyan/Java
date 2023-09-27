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
        System.out.println("What is your sibling's birth year? ");
        int yearSibling = myObj.nextInt();


        Age test = new Age(currentYear, birthYear, yearSibling);



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
    }
}