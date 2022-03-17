package core.schemas;

public class Difficulty {
    private int leaderboardId, difficulty;
    private String gameMode, difficultyRaw;

    public Difficulty(int leaderboardId, int difficulty, String gameMode, String difficultyRaw) {
        this.leaderboardId = leaderboardId;
        this.difficulty = difficulty;
        this.gameMode = gameMode;
        this.difficultyRaw = difficultyRaw;
    }

    public int getLeaderboardId() {
        return leaderboardId;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getGameMode() {
        return gameMode;
    }

    public String getDifficultyRaw() {
        return difficultyRaw;
    }
}
