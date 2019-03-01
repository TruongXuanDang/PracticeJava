import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itemId;
        String name;
        String producer;
        double price;

        System.out.println("Item ID: ");
        itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Producer: ");
        producer = scanner.nextLine();
        System.out.println("Price: ");
        price = scanner.nextDouble();

        Item item = new Item(itemId,name,producer,price);

        System.out.println("----------");
        System.out.println(item.toString());
    }
}
