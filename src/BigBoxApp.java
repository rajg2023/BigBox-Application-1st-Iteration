
import java.util.InputMismatchException;
import java.util.Scanner;

public class BigBoxApp {

    public static void main(String[] args) {
        // Print Welcome Message
        System.out.println("Welcome to the Big Box Application!!");
        System.out.println();
        String inDiv = "";
        String inStore = "";
        //Importing scanner
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            //Get user Entries
            inDiv = Validator.getStringNumeric(sc, "Enter a division #:  ", 3);
            inStore = Validator.getStringNumeric(sc, "Enter a Store #:  ", 5);
            //Validate the input from StoreDB.java
            Store store = StoreDB.getStoreByDivisionStore(inDiv, inStore);
            //Display the output
            System.out.println();
            try {
                if (store != null) {
                    //will print the message if it is true
                } else {
                    System.out.println("No Store found for Division " + inDiv + " and StoreNbr " + inStore + ".\n");
                    choice = Validator.getChoice();
                    continue;
                }
                //   choice = Validator.getChoice();
            } catch (InputMismatchException e) {
                System.out.println("No nulls allowed\n");
                //	choice = Validator.getChoice();

            }
            String message = "Store found for Division " + inDiv + " and StoreNbr " + inStore + ".\n"
                    + "[Store:  store#=" + store.getStoreNumber() + ", Division Number=" + store.getDivisionNumber() + ", Sales=" + store.getFormattedSales() + "]\n"
                    + "[Facilty: " + "id=" + store.getId() + ", name=" + store.getName() + ", address=" + store.getAddress() + ", city=" + store.getCity() + ", state=" + store.getState() + ", zip=" + store.getZipCode() + "]";
            System.out.println(message);
            System.out.println();
            choice = Validator.getChoice();
            System.out.println();

        }

    }

}
