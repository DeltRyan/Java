public class Age
{
    private int currentYear;
    private int birthYear;
    private boolean older;

    public boolean older(int ageDifference)
    {
        if (ageDifference > 0) {
            System.out.print("You are ");
            System.out.print(ageDifference);
            System.out.println(" years older than your sibling");
            older = true;
        }
        if (ageDifference == 0) {
            System.out.print("You are the same age as your sibling");
        }
        if (ageDifference < 0) {
            System.out.print("You are ");
            ageDifference = ageDifference * -1;
            System.out.print(ageDifference);
            System.out.println(" years younger than your sibling");
            older = false;
        }
        return older;
    }
}
