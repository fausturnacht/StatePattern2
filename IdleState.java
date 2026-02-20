public class IdleState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void selectItem(){
        vendingMachine.state = new ItemSelectedState(vendingMachine);
        System.out.println("Item Selected: Generic Item.");
    }

    public void insertCoin(){
        System.out.println("Cannot insert coin: Select item first.");
    }

    public void dispenseItem(){
        System.out.println("Cannot dispense item: Select item first.");
    }

    public void setOutOfOrder(){
        vendingMachine.state = new OutOfOrderState(vendingMachine);
        System.out.println("Set machine to Out of Order. Please contact a technician.");
    }
}