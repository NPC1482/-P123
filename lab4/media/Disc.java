package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(int id, String title, String category, int length, int length1, String director) {
        super(title, category, length);
        this.length = length1;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}