package snackBarApp;

public class Customer{

    //setting up the private values
    public static int maxId=0;
    private int id;
    private String name;
    private double wallet;

    //constructor
    public Customer(String name, double wallet){
        maxId++;
        id= maxId;

        this.name = name;
        this.wallet = wallet;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getWallet(){
        return wallet;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWallet(double wallet){
        this.wallet = wallet;
    }

    //add, substract
    public void addCash(double cash){
        this.wallet += cash;
    }

    public void buySnack(double snackCost){
        this.wallet -= snackCost;
    }

    @Override public String toString(){
        return "Customer " + id + ": " + name + " has " + wallet;
    }
}