public class DispensingState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;

        new Thread(() -> {
            try {
                Thread.sleep(3000);
                vendingMachine.state = new IdleState(vendingMachine);
                System.out.println("\nItem has been dispensed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public void selectItem(){
        System.out.println("Cannot select item: Please wait until item is dispensed.");
    }

    public void insertCoin(){
        System.out.println("Cannot insert coin: Please wait until item is dispensed.");
    }

    public void dispenseItem(){
        System.out.println("Item is already being dispensed.");
    }

    public void setOutOfOrder(){
        vendingMachine.state = new OutOfOrderState(vendingMachine);
        System.out.println("Set machine to Out of Order. Please contact a technician.");
    }

}
