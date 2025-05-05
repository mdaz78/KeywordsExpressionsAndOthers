public class Challenge {
    public static void main(String[] args) {
        calculateScore();
    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
