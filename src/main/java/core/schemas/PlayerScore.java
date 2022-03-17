package core.schemas;

public class PlayerScore {
    private Score score;
    private LeaderboardInfo leaderboard;

    public PlayerScore(Score score, LeaderboardInfo leaderboard) {
        this.score = score;
        this.leaderboard = leaderboard;
    }

    public Score getScore() {
        return score;
    }

    public LeaderboardInfo getLeaderboard() {
        return leaderboard;
    }
}
