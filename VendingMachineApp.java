import java.util.Scanner;

public class VendingMachineApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine(input);

        System.out.println("Welcome to Generic Vending Machine™!");

        while(true){
            System.out.print("\nPlease select one of the options:"
                + "\n1. Select an item"
                + "\n2. Insert a coin"
                + "\n3. Dispense the item"
                + "\n4. Set the machine out of order"
                + "\nEnter your choice: "
            );

            int choice = 0;
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                input.nextLine(); // Clear the invalid input
                continue;
            }

            switch(choice){
                case 1:
                    vendingMachine.selectItem();
                    break;
                case 2:
                    vendingMachine.insertCoin();
                    break;
                case 3:
                    vendingMachine.dispenseItem();
                    break;
                case 4:
                    vendingMachine.setOutOfOrder();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            
        }
        // System.out.println("\nDebug: Selecting an item.");
        // vendingMachine.selectItem();
        // System.out.println("\nDebug: Selecting an item TWICE. Disallowed.");
        // vendingMachine.selectItem();
        // System.out.println("\nDebug: Insert a coin.");
        // vendingMachine.insertCoin();
        // System.out.println("\nDebug: Dispenses an item.");
        // vendingMachine.dispenseItem();
        // System.out.println("\nDebug: Attempt to select an item and insert a coin. Both fail, machine is at dispensing state for three seconds.");
        // vendingMachine.selectItem();
        // vendingMachine.insertCoin();

        // System.out.println("\nDebug: Wait five seconds to ensure machine is not on dispensing state when doing more operations.");
        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // System.out.println("\nDebug: Machine should work as intended.");
        // vendingMachine.insertCoin();
        // vendingMachine.selectItem();

        // System.out.println("\nDebug: Setting machine as out of order.");
        // vendingMachine.setOutOfOrder();
        // System.out.println("\nDebug: All actions disallowed.");
        // vendingMachine.selectItem();
        // vendingMachine.insertCoin();
        // vendingMachine.setOutOfOrder();
    }
}
