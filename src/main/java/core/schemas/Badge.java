package core.schemas;

public class Badge {
    private String description, image;

    public Badge(String description, String image) {
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
