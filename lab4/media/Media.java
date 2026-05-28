package hust.soict.dsai.aims.media;

public abstract class Media implements Comparable<Media>{
    private final String title;
    private final String category;
    private final float cost;

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return title + " - " + category + " - " + cost + " $";
    }

    @Override
    public int compareTo(Media other) {
        int titleCompare =
                this.getTitle().compareTo(other.getTitle());

        if (titleCompare != 0)
            return titleCompare;

        return Float.compare(this.getCost(), other.getCost());
    }
}
