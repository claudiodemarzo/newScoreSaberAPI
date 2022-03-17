package core.schemas;

import java.util.GregorianCalendar;
import java.util.List;

public class LeaderboardInfo {
    private int id, maxScore, plays, dailyPlays;
    private String songHash, songName, songSubName, songAuthorName, levelAuthorName, coverImage;
    private Difficulty difficulty;
    private GregorianCalendar createdDate, rankedDate, qualifiedDate, lovedDate;
    private boolean ranked, qualified, loved, positiveModifiers;
    private double maxPP, stars;
    private Score playerScore;
    private List<Difficulty> difficulties;

    public LeaderboardInfo(int id, int maxScore, int plays, int dailyPlays, String songHash, String songName, String songSubName, String songAuthorName, String levelAuthorName, String coverImage, Difficulty difficulty, GregorianCalendar createdDate, GregorianCalendar rankedDate, GregorianCalendar qualifiedDate, GregorianCalendar lovedDate, boolean ranked, boolean qualified, boolean loved, boolean positiveModifiers, double maxPP, double stars, Score playerScore, List<Difficulty> difficulties) {
        this.id = id;
        this.maxScore = maxScore;
        this.plays = plays;
        this.dailyPlays = dailyPlays;
        this.songHash = songHash;
        this.songName = songName;
        this.songSubName = songSubName;
        this.songAuthorName = songAuthorName;
        this.levelAuthorName = levelAuthorName;
        this.coverImage = coverImage;
        this.difficulty = difficulty;
        this.createdDate = createdDate;
        this.rankedDate = rankedDate;
        this.qualifiedDate = qualifiedDate;
        this.lovedDate = lovedDate;
        this.ranked = ranked;
        this.qualified = qualified;
        this.loved = loved;
        this.positiveModifiers = positiveModifiers;
        this.maxPP = maxPP;
        this.stars = stars;
        this.playerScore = playerScore;
        this.difficulties = difficulties;
    }

    public int getId() {
        return id;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public int getPlays() {
        return plays;
    }

    public int getDailyPlays() {
        return dailyPlays;
    }

    public String getSongHash() {
        return songHash;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongSubName() {
        return songSubName;
    }

    public String getSongAuthorName() {
        return songAuthorName;
    }

    public String getLevelAuthorName() {
        return levelAuthorName;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public GregorianCalendar getCreatedDate() {
        return createdDate;
    }

    public GregorianCalendar getRankedDate() {
        return rankedDate;
    }

    public GregorianCalendar getQualifiedDate() {
        return qualifiedDate;
    }

    public GregorianCalendar getLovedDate() {
        return lovedDate;
    }

    public boolean isRanked() {
        return ranked;
    }

    public boolean isQualified() {
        return qualified;
    }

    public boolean isLoved() {
        return loved;
    }

    public boolean isPositiveModifiers() {
        return positiveModifiers;
    }

    public double getMaxPP() {
        return maxPP;
    }

    public double getStars() {
        return stars;
    }

    public Score getPlayerScore() {
        return playerScore;
    }

    public List<Difficulty> getDifficulties() {
        return difficulties;
    }
}
