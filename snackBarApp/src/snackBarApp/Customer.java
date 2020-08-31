package snackBarApp;

public class Main{

	//setting up the private values
	public static int maxId=0;
	private int id;
	private String name;
	private double wallet;

	//constructor
	public Customer(String name, double wallet){
		maxId++;
		id= maxId;

		this.name;
		this.wallet;
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
		this.id=id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setWallet(double wallet){
		this.wallet = wallet;
	}

	//buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

}
