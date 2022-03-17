package core.schemas;

import java.util.List;

public class ScoreCollection {
    private List<Score> scores;
    private Metadata metadata;

    public ScoreCollection(List<Score> scores, Metadata metadata) {
        this.scores = scores;
        this.metadata = metadata;
    }

    public List<Score> getScores() {
        return scores;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
