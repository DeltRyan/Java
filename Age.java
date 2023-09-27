public class Age
{
    private boolean older;
    private int currentYear;
    private int yearSibling;

    public Age(int currentYear, int birthYear, int yearSibling)
    {
        int age = currentYear - birthYear;
        int ageSib = currentYear - yearSibling;
        int ageDifference = age - ageSib;
        older(ageDifference, age);
        this.currentYear = currentYear;
        this.yearSibling = yearSibling;
    }
    public boolean older(int ageDifference, int age)
    {
        System.out.println(this.currentYear);
        double ageDifferenceTimes;
        if (ageDifference > 0)
        {
            System.out.print("You are ");
            System.out.print(ageDifference);
            System.out.println(" years older than your sibling");
            //older = true;

            ageDifferenceTimes = (double)age / (this.currentYear - this.yearSibling);
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
            //older = false;

            ageDifferenceTimes = (double)(this.currentYear - this.yearSibling) / age;
            ageDifferenceTimes = Math.round(ageDifferenceTimes * 100.0) / 100.0;
            System.out.print("You are ");
            System.out.print(ageDifferenceTimes);
            System.out.println(" times younger than your sibling");
        }
        return older;
    }

}

