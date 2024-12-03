public class Statistics
  {
    private int playerWins;
    private int aiWins;
    private int totalGames;

    public Statistics() {
        this.playerWins = 0;
        this.aiWins = 0;
        this.totalGames = 0;
    }

    public void recordWin(String winner) {
        totalGames++;
        if (winner.equals("Player")) {
            playerWins++;
        } else {
            aiWins++;
        }
    }

    public void displayStats() {
        System.out.println("Player Wins: " + playerWins);
        System.out.println("AI Wins: " + aiWins);
        System.out.println("Total Games: " + totalGames);
    }
}
