/**
ITSC 1212 Module 11 Lab – Arrays 1
*/
import java.util.Scanner;

public class Business {

    public static void main(String[] args)throws InterruptedException {
        // Setup variables for business information
        String companyName = "Babu's Kitchen"; // initialize with your company name
        String myName = "Seeshma"; // initialize with your name
        String[] menu = {"Chicken Curry With Rice", "Chaat", "Egg Biriyani", "Masala Dosa", "Mango Lassi", "Masala Chai"}; // initialize with at least 6 menu items
        // Scanner object to capture input
        Scanner sc = new Scanner(System. in);

        // Print a decorative line as the first thing
        String decorativeLine = "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&";
        System.out.println(decorativeLine + "\n");

        // Print a welcome message that uses the name and the business name
        System.out.println("Welcome to " + myName + "'s " + companyName + "!");

        // Ask the user for their name using the name in the prompt message
        System.out.println("I'm " + myName + ". What's your name?");
        // get (save) the user’s name
        String customer = sc.nextLine();
        // then greet them using their name
        System.out.println(
            "Hi, " + customer + "! Would you like to place an order? Here's what we offer:");

        //Print information to let the user know what is happening
        System.out.print("loading menu ");
       
        // a loop to slow output and create a visual for loading menu process
        for (int i = 0; i < 10; i++) {
            System.out.print(". ");
            Thread.sleep(300);
        }

        // Print a decorative line to breakup the output
        System.out.println("\n" + decorativeLine);
       
        // Add your code here
        System.out.println("\t MENU:");
        for (String dishes : menu) {
            System.out.println("\t" + "\n ~ " + dishes + " ~ ");
            Thread.sleep(500);
        }
        //ask order
        System.out.println("How many items would you like to order?");
        int numItems = sc.nextInt();
        sc.nextLine();

        String[] order = new String[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.println("Please enter the number of your first item:");
            int itemNumber = sc.nextInt();
            sc.nextLine();
            order[i] = menu[itemNumber - 1];
        }
        System.out.println("Thank you for your order. You have ordered:");
        for (int i = 0; i < order.length; i++) {
            System.out.print(order[i]);
            if (i < numItems - 1) {
            System.out.print(", ");
        }
    }
        System.out.println("\n Thank you, " + customer + "! Your order of " + numItems + " items is coming right up.");
    }
}
