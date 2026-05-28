package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;
import org.jetbrains.annotations.NotNull;

public class DigitalVideoDisc extends Disc implements Playable{
    private static float length;
    private String title;
    private String category;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(int i, String lionKing, String animation, float v, int i1, String disney) {
        super(null, null, length);
        this.title = title;
        this.category = category;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String animation, String rogerAllers, int i, float v) {
        this(2, "Lion King", "Animation", 18.5f, 87, "Disney");
        this.title = title;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {return cost;}

    public int getId(){ return id;}

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + " : " + getCost() + " $";
    }
    public boolean isMatch(@NotNull String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    public void setTitle(String title) {this.title = title;}

    @Override
    public void play() throws PlayerException {
        if (getLength() <= 0) {
            throw new PlayerException(
                    "ERROR: DVD length is non-positive"
            );
        }

        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}