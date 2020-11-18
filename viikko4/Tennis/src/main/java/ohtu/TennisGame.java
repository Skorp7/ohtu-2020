package ohtu;


public class TennisGame {
    
    private int player1scores = 0;
    private int player2scores = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1scores++;
        } else if (playerName.equals(player2Name)) {
            player2scores++;
        }
    }

    public String getScore() {
        String[] scoreToString = {"Love", "Fifteen", "Thirty", "Forty"};
        if (player1scores > 3 || player2scores > 3) {
            return getWinScores();
        }
        if (player1scores == player2scores) {
            return scoreToString[player1scores] + "-" + "All";
        }
        return scoreToString[player1scores] + "-" + scoreToString[player2scores];
    }
    
    private String getAdvantance() {
        if (player1scores > player2scores) {
            return "Advantage " + player1Name;
        }
        if (player1scores < player2scores) {
            return "Advantage " + player2Name;
        }
        return "Deuce";
    }
    
    private String getWinScores() {
        int difference = player1scores-player2scores;
        if (Math.abs(difference) > 1 && player1scores > player2scores) {
            return "Win for " + player1Name;
        } else if (Math.abs(difference) > 1 && player2scores > player1scores) {
            return "Win for " + player2Name;
        }
        return getAdvantance();
    }
}
