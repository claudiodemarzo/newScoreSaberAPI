package core.schemas;

import java.util.List;

public class PlayerScoreCollection {
    private List<PlayerScore> playerScores;
    private Metadata metadata;

    public PlayerScoreCollection(List<PlayerScore> playerScores, Metadata metadata) {
        this.playerScores = playerScores;
        this.metadata = metadata;
    }

    public List<PlayerScore> getPlayerScores() {
        return playerScores;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
