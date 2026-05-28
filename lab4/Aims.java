package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

import java.util.Collections;

public class Aims {
    public static void main(String[] args) throws PlayerException {
        System.out.println("AIMS Project");

        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f
        );

        Book book = new Book("Java Programming", "Education", 15.5f
        );

        CompactDisc cd = new CompactDisc("Greatest Hits", "Music", 18.0f
        );

        cd.setArtist("Taylor Swift");

        Track track1 = new Track("Love Story", 4);
        Track track2 = new Track("Blank Space", 5);

        cd.addTrack(track1);
        cd.addTrack(track2);


        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        cart.print();

        dvd.play();

        cd.play();
    }

    Collections.sort( cart.getItemsOrdered(),
            new void MediaComparatorByTitleCost());
}