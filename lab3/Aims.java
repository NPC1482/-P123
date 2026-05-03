public class Aims {
    public static void main(String[] args) {
        System.out.println("AIMS Project");

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Batman");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f);


        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.addDigitalVideoDisc(dvd4);

        System.out.println("Total cost: " + cart.totalCost());

        System.out.println("Before swap:");
        System.out.println("dvd1: " + dvd1.getTitle());
        System.out.println("dvd2: " + dvd2.getTitle());

        TestPassingParameter.swap(  dvd1, dvd2);

        System.out.println("\nAfter swap:");
        System.out.println("dvd1: " + dvd1.getTitle());
        System.out.println("dvd2: " + dvd2.getTitle());

        TestPassingParameter.changeTitle(dvd1, "New Title");

        System.out.println("\nAfter changeTitle:");
        System.out.println("dvd1: " + dvd1.getTitle());
    }
}