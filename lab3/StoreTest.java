public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin");

        store.addDVD(dvd1);
        store.addDVD(dvd2);
    }
}