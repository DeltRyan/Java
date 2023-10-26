import java.util.Scanner;

public class Person
{
    private int age;
    private String name;
    private boolean married;

    Scanner scan = new Scanner(System.in);
    public void age()
    {
        System.out.println("How old are you? ");
        this.age = scan.nextInt();
    }

    public void name ()
    {
        System.out.println("What is your name? ");
        this.name = scan.nextLine();
    }

    public void married()
    {
        System.out.println("Are you married? ");
        String married = scan.nextLine();
        married = married.toLowerCase();
        if (married == "yes")
        {
            this.married = true;
            System.out.println("Which year did you get married? ");
        }
        if (married == "no")
        {
            this.married = false;
        }
    }
}
