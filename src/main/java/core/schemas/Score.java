package core.schemas;

import java.util.GregorianCalendar;

public class Score {
    private int id, rank, baseScore, modifiedScore, badCuts, missedNotes, maxCombo, hmd;
    private LeaderboardPlayer leaderboardPlayerInfo;
    private double pp, weight, multiplier;
    private String modifiers;
    private boolean fullCombo, hasReplay;
    private GregorianCalendar timeSet;

    public Score(int id, int rank, int baseScore, int modifiedScore, int badCuts, int missedNotes, int maxCombo, int hmd, LeaderboardPlayer leaderboardPlayerInfo, double pp, double weight, double multiplier, String modifiers, boolean fullCombo, boolean hasReplay, GregorianCalendar timeSet) {
        this.id = id;
        this.rank = rank;
        this.baseScore = baseScore;
        this.modifiedScore = modifiedScore;
        this.badCuts = badCuts;
        this.missedNotes = missedNotes;
        this.maxCombo = maxCombo;
        this.hmd = hmd;
        this.leaderboardPlayerInfo = leaderboardPlayerInfo;
        this.pp = pp;
        this.weight = weight;
        this.multiplier = multiplier;
        this.modifiers = modifiers;
        this.fullCombo = fullCombo;
        this.hasReplay = hasReplay;
        this.timeSet = timeSet;
    }

    public int getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    public int getBaseScore() {
        return baseScore;
    }

    public int getModifiedScore() {
        return modifiedScore;
    }

    public int getBadCuts() {
        return badCuts;
    }

    public int getMissedNotes() {
        return missedNotes;
    }

    public int getMaxCombo() {
        return maxCombo;
    }

    public int getHmd() {
        return hmd;
    }

    public LeaderboardPlayer getLeaderboardPlayerInfo() {
        return leaderboardPlayerInfo;
    }

    public double getPp() {
        return pp;
    }

    public double getWeight() {
        return weight;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public String getModifiers() {
        return modifiers;
    }

    public boolean isFullCombo() {
        return fullCombo;
    }

    public boolean isHasReplay() {
        return hasReplay;
    }

    public GregorianCalendar getTimeSet() {
        return timeSet;
    }
}
