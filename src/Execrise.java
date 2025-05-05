public class Execrise {
    public static void main(String[] args) {
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(25);
        displayHighScorePosition("Tim", highScore);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 0;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
