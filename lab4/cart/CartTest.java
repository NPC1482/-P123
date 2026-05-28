package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    Book book = new Book("Java", "Programming", 20f);

    DigitalVideoDisc dvd =
            new DigitalVideoDisc(2, "Lion King", "Animation", 18.5f, 87, "Disney");

    CompactDisc cd =
            new CompactDisc("Hits", "Music", 15f);
}