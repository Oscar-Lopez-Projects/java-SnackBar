package snackBarApp;

public class VendingMachine{

    public static int maxId=0;
    private int vendingId;
    private String vendingName;

    //constructor
    public VendingMachine(String vendingName){
        maxId++;
        vendingId= maxId;
        this.vendingName = vendingName;
    }
    //getter
    public int getVendingId(){
        return vendingId;
    }
    public String getVendingName(){
        return vendingName;
    }

    //setters
    public void setVendingId(int vendingId){
        this.vendingId = vendingId;
    }
    public void setVendingName(String vendingName){
        this.vendingName = vendingName;
    }


    @Override
    public String toString() {
        return "Vending machine " + vendingId + ": " + vendingName;
    }
}