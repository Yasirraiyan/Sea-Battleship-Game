public class PowerUp
{
    private String type;
    private String effect;

    public PowerUp(String type, String effect)
    {
        this.type = type;
        this.effect = effect;
    }

    public String getType() 
    {
        return type;
    }

    public String getEffect() 
    {
        return effect;
    }

    public void apply(Player player)
    {
        if(type=="abc"&& effect=="good")
        {
            System.out.println("Applied");
        }
        else
        {
            System.out.println("Not applied");
        }
    }
}
