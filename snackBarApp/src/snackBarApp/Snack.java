package snackBarApp;

public class Snack{

    public static int maxId=0;
    private int snackId;
    private String snackName;
    private int snackQuantity;
    private double snackCost;
    //constructor
    public Snack(int snackQuantity,String snackName, double snackCost){
        maxId++;
        snackId= maxId;

        this.snackQuantity = snackQuantity;
        this.snackName = snackName;
        this.snackCost = snackCost;
    }

    //getters
    public String getSnackName(){
        return snackName;
    }
    public double getSnackQuantity(){
        return snackQuantity;
    }
    public double getSnackCost(){
        return snackCost;
    }
    public int getSnackId(){
        return snackId;
    }

    //setters
    public void setSnackName(String snackName){
        this.snackName = snackName;
    }
    public void setSnackQuantity(int snackQuantity){
        this.snackQuantity = snackQuantity;
    }
    public void setSnackCost(double snackCost){
        this.snackCost = snackCost;
    }
    public void setSnackId(int snackId){
        this.snackId = snackId;
    }

    //add, substract, total

    public void addSnack(double added){
        this.snackQuantity += added;
    }
    public void subtractSnack(double purchased){
        this.snackQuantity -=purchased;
    }
    public double totalCost(int snackQuantity, double snackCost){
        return snackCost * snackQuantity;
    }

    @Override
    public String toString() {
        return "snack "+ snackId +": has a quantity of " +  snackQuantity + " "+ snackName + " at $" + snackCost;
    }
}
