
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice = 1;            // One variable that changes depending on what menu option you chose to run
        do {                                // do while menuChoice is not 0, 0 will quit the loop and the program
            switch (menuChoice) {
                case 0 :
                    System.out.println("Turning off.");
                    break;
                case 1 :
                    menuChoice = menus.mainMenu();
                    break;
                case 2 :                              //the case chosen will call a module with the code you want to do
                    menuChoice = menus.itemMenu();
                    break;                            // that might be a new menu or another function like printing a review
                case 3 :                              // this way our code is not all in a big tree but we instead call on it
                    menuChoice = menus.reviewMenu();
                    break;
                case 4 :
                    menuChoice = menus.transactionMenu();
                    break;
                case 5 :
                    //run Transaction Options Menu code module
                    break;
                case 6 :
                    //run Return to main menu
                    break;
                case 7 :
                    //run Print total profits from all item purchases
                    break;
                case 8 :
                    //run Print the total number item transactions made
                    break;
                case 9 :
                    //run Print all transactions made
                    break;
                case 10 :
                    //run Print the total profit of a specific item
                    break;
                case 11 :
                    //run Print the number of units sold of a specific item
                    break;
                case 12 :
                    //run Print all transactions of a specific item
                    break;
                case 13 :
                    //run Print the item with the highest profit
                    break;
            }
        } while (menuChoice != 0);
    }
}
