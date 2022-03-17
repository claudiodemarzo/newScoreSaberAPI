package core.schemas;

import java.util.List;

public class LeaderboardInfoCollection {
    private List<LeaderboardInfo> leaderboards;
    private Metadata metadata;

    public LeaderboardInfoCollection(List<LeaderboardInfo> leaderboards, Metadata metadata) {
        this.leaderboards = leaderboards;
        this.metadata = metadata;
    }

    public List<LeaderboardInfo> getLeaderboards() {
        return leaderboards;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
