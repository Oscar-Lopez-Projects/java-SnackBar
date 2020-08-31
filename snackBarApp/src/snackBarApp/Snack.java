package snackBarApp;

public class Main{

	public static int maxId=0;
	private int snackId;
	private String snackName;
	private double snackQuantity;
	private double snackCost;

	//constructor
	public Snack(String snackName,double snackQuantity, double snackCost){
		maxId++;
		snackId= maxId;

		this.snackName = snackName;
		this.snackQuantity = snackQuantity;
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
		return snackId
	}

	//setters
	public void setSnackName(String snackName){
		this.snackName = snackName;
	}
	public void setSnackQuantity(double snackQuantity){
		this.snackQuantity = snackQuantity;
	}
	public void setSnackCost(double snackCost){
		this.snackCost = snackCost;
	}
	public void setSnackId(int snackId){
		this.snackId = snackId;
	}
}