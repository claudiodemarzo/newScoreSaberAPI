package core.schemas;

import java.util.List;

public class PlayerCollection {
    private List<Player> players;
    private Metadata metadata;

    public PlayerCollection(List<Player> players, Metadata metadata) {
        this.players = players;
        this.metadata = metadata;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
