import Modules.userInput;
import facade.Facade;

import java.util.Scanner;

public class menus {

    public static int reviewMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Reviews options menu:\n" +
                "0. Return to Main Menu.\n" +
                "1. Create a review for an Item.\n" +
                "2. Print a specific review of an Item.\n" +
                "3. Print all reviews of an Item.\n" +
                "4. Print mean grade of an Item\n" +
                "5. Print all comments of an Item.\n" +
                "6. Print all registered reviews.\n" +
                "7. Print item(s) with most reviews.\n" +
                "8. Print item(s) with least reviews.\n" +
                "9. Print item(s) with best mean review grade.\n" +
                "10. Print item(s) with worst mean review grade.\n" +
                "\n" +
                "Type an option number: ");
        int value = 0;
        int choice = 0;
        do {                                    // do loop to repeat the menu if the user makes a bad input
            choice = input.nextInt();       // read user input
            switch (choice) {
                case 0:
                    value = 1;
                    //        Return to main menu
                    break;
                case 1:
                    // Create a review for an Item.
                    break;
                case 2:
                    // Print a specific review of an Item.
                    break;
                case 3:
                    // Print all reviews on an Item.
                    break;
                case 4:
                    // Print mean grade of an Item.
                    break;
                case 5:
                    // Print all comments of an Item.
                    break;
                case 6:
                    // Print all registered reviews.
                    break;
                case 7:
                    // Print item(s) with the most reviews.
                    break;
                case 8:
                    // Print item(s) with the least reviews.
                    break;
                case 9:
                    // Print item(s) with the best mean review grade.
                    break;
                case 10:
                    // Print item(s) with the worst mean review grade.
                    break;
                default:
                    System.out.println("You did not enter a valid option, please try again.");
            }
        } while (choice < 0 || choice > 10);
        System.out.println("You picked option: " + value);
        return value;
    }

    public static int transactionMenu () {
        Scanner input = new Scanner(System.in);
        System.out.print("Transaction History options menu:\n" +
                "0. Return to Main Menu.\n" +
                "1. Print total profit from all item purchases\n" +
                "2. Print total units sold from all item purchases\n" +
                "3. Print the total number of item transactions made.\n" +
                "4. Print all transactions made.\n" +
                "5. Print the total profit of a specific item.\n" +
                "6. Print the number of units sold of a specific item.\n" +
                "7. Print all transactions of a specific item.\n" +
                "8. Print item with highest profit.\n" +
                "\n" +
                "Type an option number: ");
        int value = 0;
        int choice = 0;
        do {
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    value = 1;
                    //Return to Main Menu
                    break;
                case 1:
                    //Print total profit from all item purchases
                    break;
                case 2:
                    //Print total units sold from all item purchases
                    break;
                case 3:
                    //Print the total number of item transactions made.
                    break;
                case 4:
                    //Print all transactions made
                    break;
                case 5:
                    //Print the total profit of a specific item
                    break;
                case 6:
                    //Print the number of units sold of a specific item
                    break;
                case 7:
                    //Print all transactions of a specific item
                    break;
                case 8:
                    //Print item with the highest profit
                    break;
                default:
                    System.out.println("Invalid menu option. Please type another option");
                    break;
            }
        }while (choice < 0 || choice > 8);
        return value;

    }

    public static int mainMenu () {
        Scanner input = new Scanner(System.in);
        System.out.print("Main Menu: Please choose among the options below.\n" +
                "\n" +
                "0. Close system.\n" +
                "1. Open Item options.\n" +
                "2. Open Review options.\n" +
                "3. Open Transaction History options.\n" +
                "\n" +
                "Type an option number:\n");
        //menuMain == 4;
        int value = 0;
        int choice = 0;
        do {
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    value = 0;
                    break;
                case 1:
                    value = 2;
                    break;
                case 2:
                    value = 3;
                    break;
                case 3:
                    value = 4;
                    break;
                default:
                    System.out.println("Invalid menu option. Please type another option");
                    break;
            }
        }while (choice < 0 || choice > 3);
        return value;

    }

    public static int itemMenu () {
        Scanner input = new Scanner(System.in);
        System.out.print("Item options menu:\n" +
                "0. Return to Main Menu.\n" +
                "1. Create a Item.\n" +
                "2. Remove an Item.\n" +
                "3. Print all registered Items.\n" +
                "4. Buy an Item.\n" +
                "5. Update an item's name.\n" +
                "6. Update an item's price.\n" +
                "\n" +
                "Type an option number: ");
        int value = 0;
        int choice = 0;
        do {
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    value = 1;
                    //Return to Main Menu
                    break;
                case 1:
                    //Modules.userInput.readLine("Enter the itemID")
                    // Modules.Item.createItem(itemID, itemName, unitPrice);
                    //Create an Item
                    break;
                case 2:
                    //Remove an Item
                    break;
                case 3:
                    //Print all registered Items
                    break;
                case 4:
                    //Buy an Item
                    break;
                case 5:
                    //Update an item's name
                    break;
                case 6:
                    //Update an item's price

                    String itemID = Modules.userInput.readLine("Please enter itemID: ");
                    double newPrice = Modules.userInput.readDouble("Please enter a new price: ");

                    break;
                default:
                    System.out.println("Invalid menu option. Please type another option");
                    break;
            }
        }while (choice < 0 || choice > 6);
        return value;


    }


}
