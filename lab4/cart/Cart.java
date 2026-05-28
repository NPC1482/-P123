package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

import java.util.ArrayList;

public class Cart {
    int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;

    public final ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Media added to cart");
        }
        else System.out.println("Media already exists");

        itemsOrdered.set(qtyOrdered, media);
        qtyOrdered++;
        System.out.println("The disc has been added");
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Media removed from cart");
        }
        else
            System.out.println("Media not found");
    }

    public float totalCost() {
        float total = 0;

        for (Media media : itemsOrdered)
            total += media.getCost();

        return total;
    }

    public void print() throws PlayerException {
        for (int i = 0; i < qtyOrdered; i++) {

            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());

            if (itemsOrdered.get(i) instanceof Playable playable) {
                try {playable.play();}
                catch (PlayerException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Total cost: " + totalCost() + "$");
    }
}