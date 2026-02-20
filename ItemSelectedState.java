public class ItemSelectedState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public ItemSelectedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(){
        System.out.println("Cannot select item: You have already selected an item!");
    }

    public void insertCoin(){
        System.out.print("Please insert a coin. 1, 5, 10, 20 denominations accepted: ");
        double coin = vendingMachine.scanner.nextDouble();
        vendingMachine.balance += coin;
        System.out.println("Coin inserted: " + coin + " | Balance: " + vendingMachine.balance);
    }

    public void dispenseItem(){
        vendingMachine.state = new DispensingState(vendingMachine);
        System.out.println("Dispensing Item!");
    }

    public void setOutOfOrder(){
        vendingMachine.state = new OutOfOrderState(vendingMachine);
        System.out.println("Set machine to Out of Order. Please contact a technician.");
    }
}