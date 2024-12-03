public class Battle 
{
    private Player player;
    private AIPlayer aiPlayer;

    public Battle(Player player, AIPlayer aiPlayer)
    {
        this.player = player;
        this.aiPlayer = aiPlayer;
    }

    public void startBattle() 
    {
        System.out.println("Battle started between " + player.getName() + " and " + aiPlayer.getName());
        
    }
}
