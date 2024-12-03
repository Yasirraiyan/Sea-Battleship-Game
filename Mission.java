public class Mission 
{
    private String objective;
    private boolean isCompleted;

    public Mission(String objective) 
    {
        this.objective = objective;
        this.isCompleted = false;
    }

    public String getObjective() 
    {
        return objective;
    }

    public boolean isCompleted()
    {
        return isCompleted;
    }

    public void completeMission()
    {
        isCompleted = true;
        System.out.println("Mission " + objective + " is completed.");
    }
}
