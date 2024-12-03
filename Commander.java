public class Commander
{
    private String name;
    private int experience;

    public Commander(String name, int experience) 
    {
        this.name = name;
        this.experience = experience;
    }

    public String getName()
    {
        return name;
    }

    public int getExperience() 
    {
        return experience;
    }

    public void leadFleet(Fleet fleet)
    {
        System.out.println("Commander " + name + " is leading the fleet.");
        
    }
}
