public class Supply
{
    private int food;
    private int ammunition;

    public Supply(int food, int ammunition) 
    {
        this.food = food;
        this.ammunition = ammunition;
    }

    public int getFood()
    {
        return food;
    }

    public int getAmmunition() 
    {
        return ammunition;
    }

    public void resupply(Ship ship)
    {
        System.out.println("Resupplying ship with food: " + food + " and ammunition: " + ammunition);
        
    }
}
