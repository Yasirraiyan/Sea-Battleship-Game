public class DefenseSystem 
{
    private String type;
    private int strength;

    public DefenseSystem(String type, int strength)
    {
        this.type = type;
        this.strength = strength;
    }

    public String getType()
    {
        return type;
    }

    public int getStrength() 
    {
        return strength;
    }

    public void activate() 
    {
        System.out.println("Activating defense system: " + type + " with strength " + strength);
   }
}
