import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    private boolean married;
    private int marriedYear;
    private String gender;

    Scanner scan = new Scanner(System.in);

    public Person() {
        name();
        age();
        married();
    }

    public void age() {
        System.out.println("How old are you? ");
        this.age = scan.nextInt();
        System.out.println(age);

        int birthYear = currentYear() - age;
        System.out.println(birthYear);
    }

    public void name() {
        System.out.println("What is your name? ");
        this.name = scan.nextLine();
        System.out.println(name);
    }

    public int currentYear() {
        System.out.println("What year is it right now?");
        return scan.nextInt();

    }

    public void married() {
        String alive = "yes";
        boolean partnerDead = false;
        System.out.println("Are you married? ");
        String married = scan.next();
        married = married.toLowerCase();
        System.out.println(married);
        if (married.equals("yes")) {
            this.married = true;
            System.out.println("Which year did you get married? ");
            this.marriedYear = scan.nextInt();
            System.out.println(marriedYear);

            System.out.println("Is your partner still alive?");
            alive = scan.next();
            alive = alive.toLowerCase();

        }
        if (married.equals("no"))
        {
            this.married = false;
        }
        if(married.equals("yes") && alive.equals("yes"))
        {
            System.out.println("What their gender?");
            this.gender = scan.nextLine();
        }
    }
    public String getName()
    {
        return name;
    }
    public boolean equals(Person other)
    {
        return getName().equals(other.getName());
    }
}