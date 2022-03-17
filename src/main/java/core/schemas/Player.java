package core.schemas;

import java.util.List;

public class Player {
    private String id, name, profilePicture, country, role, histories;
    private double pp;
    private int rank, countryRank, permissions;
    private List<Badge> badges;
    private List<ScoreStats> scoreStats;
    private boolean banned, inactive;

    public Player(String id, String name, String profilePicture, String country, String role, String histories, double pp, int rank, int countryRank, int permissions, List<Badge> badges, List<ScoreStats> scoreStats, boolean banned, boolean inactive) {
        this.id = id;
        this.name = name;
        this.profilePicture = profilePicture;
        this.country = country;
        this.role = role;
        this.histories = histories;
        this.pp = pp;
        this.rank = rank;
        this.countryRank = countryRank;
        this.permissions = permissions;
        this.badges = badges;
        this.scoreStats = scoreStats;
        this.banned = banned;
        this.inactive = inactive;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getCountry() {
        return country;
    }

    public String getRole() {
        return role;
    }

    public String getHistories() {
        return histories;
    }

    public double getPp() {
        return pp;
    }

    public int getRank() {
        return rank;
    }

    public int getCountryRank() {
        return countryRank;
    }

    public int getPermissions() {
        return permissions;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public List<ScoreStats> getScoreStats() {
        return scoreStats;
    }

    public boolean isBanned() {
        return banned;
    }

    public boolean isInactive() {
        return inactive;
    }
}
