package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {this.artist = artist;}

    public void addTrack(Track track){
        if (tracks.contains(track))
            System.out.println("Track exists");
        else {
            tracks.add(track);
            System.out.println("Added");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Removed");
        }
        else System.out.println("Not found");
    }

    @Override
    public int getLength() {
        int s=0;
        for(Track track : tracks)
            s += track.getLength();
        return s;
    }

    @Override
    public void play() throws PlayerException {
        System.out.println("Playing CD: " + getTitle());

        for (Track track : tracks)
            track.play();
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " + artist + " - " + getCost() + "$";
    }
}
