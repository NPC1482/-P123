public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int qty = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qty < itemsInStore.length) {
            itemsInStore[qty++] = dvd;
            System.out.println("DVD added to store");
        } else {
            System.out.println("Store is full");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;

        for (int i = 0; i < qty; i++) {
            if (itemsInStore[i] == dvd) {
                found = true;

                for (int j = i; j < qty - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }

                itemsInStore[qty - 1] = null;
                qty--;

                System.out.println("DVD removed from store");
                break;
            }
        }

        if (!found) {
            System.out.println("DVD not found");
        }
    }
}