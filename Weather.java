public class Weather
{
    private String condition;

    public Weather(String condition) 
    {
        this.condition = condition;
    }

    public String getCondition() 
    {
        return condition;
    }

    public void affectBattle() 
    {
        System.out.println("Current weather condition: " + condition);
        
    }
}
