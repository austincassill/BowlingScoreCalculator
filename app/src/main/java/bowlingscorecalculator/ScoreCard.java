package bowlingscorecalculator;

public class ScoreCard implements IScoreCard {
    
    public int Calculate(String scoreCard) {
        int[] scores = GetScores(scoreCard);

        int totalScore = GetTotalScore(scores);

        return totalScore;
    }

    private int GetTotalScore(int[] scores) {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return totalScore;
    }

    private int[] GetScores(String scoreCard) {
        scoreCard = scoreCard.replace(" ", "");
        var frames = scoreCard.split("");
        int[] scores = new int[frames.length];
        
        for (int i = 0; i < frames.length; i++) {
            scores[i] = Integer.valueOf(frames[i]);
        }
        return scores;
    }
}
