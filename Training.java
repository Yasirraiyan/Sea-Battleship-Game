public class Training
{
    private int duration;
    private String type;

    public Training(int duration, String type) 
    {
        this.duration = duration;
        this.type = type;
    }

    public int getDuration() 
    {
        return duration;
    }

    public String getType() 
    {
        return type;
    }

    public void conductTraining(Soldier soldier)
    {
        System.out.println("Conducting " + type + " training for " + duration + " days.");
        
    }
}
