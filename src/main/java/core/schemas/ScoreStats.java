package core.schemas;

public class ScoreStats {
    private int totalScore, totalRankedScore, totalPlayCount, replaysWatched, rankedPlayCount;
    private double averageRankedAccuracy;

    public ScoreStats(int totalScore, int totalRankedScore, int totalPlayCount, int rankedPlayCount, int replaysWatched, double averageRankedAccuracy) {
        this.totalScore = totalScore;
        this.totalRankedScore = totalRankedScore;
        this.totalPlayCount = totalPlayCount;
        this.replaysWatched = replaysWatched;
        this.averageRankedAccuracy = averageRankedAccuracy;
        this.rankedPlayCount = rankedPlayCount;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getTotalRankedScore() {
        return totalRankedScore;
    }

    public int getTotalPlayCount() {
        return totalPlayCount;
    }

    public int getReplaysWatched() {
        return replaysWatched;
    }

    public int getRankedPlayCount(){
        return rankedPlayCount;
    }

    public double getAverageRankedAccuracy() {
        return averageRankedAccuracy;
    }
}
