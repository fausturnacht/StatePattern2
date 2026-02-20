public class OutOfOrderState implements VendingMachineState{

    public OutOfOrderState(VendingMachine vendingMachine){
    }
    
    @Override
    public void selectItem(){
        System.out.println("Machine is out of order. Please contact a technician.");
    }

    public void insertCoin(){
        System.out.println("Machine is out of order. Please contact a technician.");    
    }

    public void dispenseItem(){
        System.out.println("Machine is out of order. Please contact a technician.");
    }

    public void setOutOfOrder(){
        System.out.println("Machine is already out of order. Please contact a technician.");
    }
}
