import java.util.Scanner;
public class canteenDemo {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Nasi Goreng";
        item1.price = 15000;
        item1.stock = 10;
        item1.displayInfo();

        Item item2 = new Item();
        item2.name = "Donat Gula";
        item2.price = 3000;
        item2.stock = 20;
        item2.displayInfo();

        Item item3 = new Item();
        item3.name = "Cimory";
        item3.price = 7000;
        item3.stock = 15;
        item3.displayInfo();

    }
}
