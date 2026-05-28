package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        Book book = new Book(1,
                        "Java",
                        "Programming",
                        20f);

        DigitalVideoDisc dvd = new DigitalVideoDisc(
                        2,
                        "Lion King",
                        "Animation",
                        18.5f,
                        87,
                        "Disney");

        store.addMedia(book);
        store.addMedia(dvd);

        store.printStore();
    }
}