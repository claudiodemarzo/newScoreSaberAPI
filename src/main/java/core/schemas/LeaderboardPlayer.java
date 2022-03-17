package core.schemas;

public class LeaderboardPlayer {
    private String id, name, profilePicture, country, permissions, role;

    public LeaderboardPlayer(String id, String name, String profilePicture, String country, String permissions, String role) {
        this.id = id;
        this.name = name;
        this.profilePicture = profilePicture;
        this.country = country;
        this.permissions = permissions;
        this.role = role;
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

    public String getPermissions() {
        return permissions;
    }

    public String getRole() {
        return role;
    }
}
