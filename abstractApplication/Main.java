public class Main {
    public static void main(String[] args) {

        BaseScoreCalculator baseScoreCalculator = new MenScoreCalculator();
        baseScoreCalculator.scoreCalculate();
        baseScoreCalculator.gameOver();

        BaseScoreCalculator baseScoreCalculator1 = new WomanScoreCalculation();
        baseScoreCalculator1.scoreCalculate();
        baseScoreCalculator1.gameOver();

    }
}