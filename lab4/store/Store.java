package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private final ArrayList<Media> itemsInStore = new ArrayList<Media>();    private int qty = 0;

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Media added to store");
        }
        else
            System.out.println("Media already exists");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed from store");
        }
        else
            System.out.println("Media not found");
    }

    public void printStore() {
        for (Media media : itemsInStore)
            System.out.println(media);
    }
}