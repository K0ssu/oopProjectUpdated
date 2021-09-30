package Modules;

public class Item {

    private String itemID;
    private String itemName;
    private double unitPrice;

    public Item(String itenID, String itemName, double unitPrice){
        this.itemID = itemID;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }

  /*  public void print() {
        System.out.print("You have created an Item with the " + "\n" +
                "ID    : " + this.itemIdentification + "\n"+
                "Name  : " + this.itemName + "\n" +
                "Price : " + this.itemPrice + "$");
    }
*/
    //  public String createItem(String itemID, String itemName, double unitPrice){
  //        return "";
  //    }
    public static String createItem(String itemID, String itemName, double unitPrice) {
        do {
            if(itemID.isEmpty() || itemName.isEmpty() || unitPrice <= 0) {
                System.out.println("Invalid data for item.");
            }
        itemID = userInput.readLine("Please enter the ID for the item you would like to create: ");
        itemName = userInput.readLine("Please enter the name of the Item you would like to create: ");
        unitPrice = userInput.readDouble("Please enter the price of the item you would like to create: ");

        } while (itemID.isEmpty() || itemName.isEmpty() || unitPrice <= 0);

        return "Item" + itemID + " was registered successfully.";

    }

    public String updateItemPrice(String itemID, double newPrice) {
        Item anItem = new Item(itemID, itemName, unitPrice);
        Item newItem = new Item(itemID, itemName, newPrice);
        do {
            if(unitPrice <= 0) {
                System.out.println("Invalid data for item.");
            }
            unitPrice = userInput.readDouble("Please enter a new price for item "+ itemID +" : ");
        } while (unitPrice <= 0);
       unitPrice = newPrice;
        return "The price of " + newItem + " has been changed to " + newPrice + ".";
    }

   /*  public String updateItemName(String itemID, String newName){
        do {
            if(itemName.isEmpty()) {
                System.out.println("Invalid data for item.");
            }
            itemPrice = userInput.readDouble("Please enter a new price for item"+ itemID +" : ");
        } while (itemPrice <= 0);
        itemID.itemPrice = newPrice;
        return "";
    }
/*
    public static void main(String[] args) {

        int itemListSize = userInput.readInt("How many items would you like to create?: ");

        Item[] itemList = new Item[itemListSize];
        for (int i = 0; i < itemListSize; i++) {
            itemList[i] = createItem();
            itemList[i].print();
        }

    }
     */
}
