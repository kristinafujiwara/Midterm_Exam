import java.util.Scanner;
public class Main extends Cafe {

    protected Main() {
        super("A", "B");
    }

    public static void main(String[] args) {
        Cafe obj = new Cafe("\t\t\tEST 2022", "\t   Welcome to FL Cafe");

        System.out.println(obj.cafeName);
        System.out.println(obj.getDesignation());

        obj.setDesignation("Cafe");

        obj.does();

        Scanner input = new Scanner(System.in);
        int addDrink = 1;
        double subTotal = 0;

        String[] menuStore = new String[8];

        menuStore[0] = "\n============= Menu ==============";
        menuStore[1] = "Coffee\t\t\t\tNon-Coffee";
        menuStore[2] = "Latte - P110\t\tChoco - P90";
        menuStore[3] = "Affogato - P140\t\tMatcha - P90";
        menuStore[4] = "Americano - P80";
        menuStore[5] = "\nBrewed Iced Tea";
        menuStore[6] = "Lemon = P60\t\t\tRaspberry - P75";
        menuStore[7] = "Peach - P70";

        System.out.println(menuStore[0]);
        System.out.println(menuStore[1]);
        System.out.println(menuStore[2]);
        System.out.println(menuStore[3]);
        System.out.println(menuStore[4]);
        System.out.println(menuStore[5]);
        System.out.println(menuStore[6]);
        System.out.println(menuStore[7]);

        while (true) {
            System.out.println("\nInput Order");
            System.out.println("Drink: ");
            String drinkName = input.next();
            System.out.print("Enter Price: ");
            double price = input.nextDouble();
            System.out.print("Quantity: ");
            double amount = input.nextDouble();
            double cost = (price * amount);
            subTotal = (cost + subTotal);
            System.out.println("Your subtotal is: P" + subTotal);
            System.out.print("Would you like to add another drink? (Enter 1 for Yes, or 2 for No): ");
            addDrink = input.nextInt();

            if (addDrink == 1) {
                menuStore[0] = "\n============= Menu ==============";
                menuStore[1] = "Coffee\t\t\t\tNon-Coffee";
                menuStore[2] = "Latte - P110\t\tChoco - P90";
                menuStore[3] = "Affogato - P140\t\tMatcha - P90";
                menuStore[4] = "Americano - P80";
                menuStore[5] = "\nBrewed Iced Tea";
                menuStore[6] = "Lemon = P60\t\t\tRaspberry - P75";
                menuStore[7] = "Peach - P70";

                System.out.println(menuStore[0]);
                System.out.println(menuStore[1]);
                System.out.println(menuStore[2]);
                System.out.println(menuStore[3]);
                System.out.println(menuStore[4]);
                System.out.println(menuStore[5]);
                System.out.println(menuStore[6]);
                System.out.println(menuStore[7]);
                continue;
            } else {
                double totalBill = ((subTotal * 0) + subTotal);
                System.out.println("\nYour total is: P" + totalBill);
                System.out.println("\nThank you for visiting FL Cafe\nPlease come again");
                break;
            }
        }
    }
}
