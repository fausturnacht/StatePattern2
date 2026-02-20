import java.util.Scanner;

public class VendingMachine {
    VendingMachineState state;
    double balance = 0;
    Scanner scanner;

    public VendingMachine(Scanner scanner){
        this.scanner = scanner;
        this.state = new IdleState(this);
    }

    public void selectItem(){
        state.selectItem();
    }

    public void insertCoin(){
        state.insertCoin();
    }

    public void dispenseItem(){
        state.dispenseItem();
    }

    public void setOutOfOrder(){
        state.setOutOfOrder();
    }

}

