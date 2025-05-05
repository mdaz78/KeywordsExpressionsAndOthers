public class Challenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }
}
