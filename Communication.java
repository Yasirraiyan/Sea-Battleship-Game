public class Communication 
{
    private String message;

    public Communication(String message) 
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void sendMessage()
    {
        System.out.println("Sending message: " + message);
        
    }
}
