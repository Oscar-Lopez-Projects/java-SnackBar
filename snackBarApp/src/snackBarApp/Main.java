package snackBarApp;

public class Main {

    public static void workWithData(){
        Customer c1 = new Customer("Jane", 44.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food vending Machine");
        VendingMachine v2 = new VendingMachine("Drinking Vending Machine");
        VendingMachine v3 = new VendingMachine("Office Vending machine");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        Snack s1= new Snack(36,"Chips",1.75);
        Snack s2= new Snack(36,"Chocolate Bar", 1.00);
        Snack s3= new Snack(30,"Pretzel",2.00);
        Snack s4 = new Snack(24,"Soda",2.50);
        Snack s5 = new Snack(20,"Water", 2.75);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(c1);
        System.out.println(c2);

        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.buySnack(s4.getSnackCost() * 3);
        s4.subtractSnack(3);
        System.out.println(c1.getName() + " has " + "$" + c1.getWallet() + " left. " + "There are " + s4.getSnackQuantity() + " " + s4.getSnackName() + "s left.");

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.buySnack(s3.getSnackCost() * 1);
        s3.subtractSnack(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getWallet() + " left. " + "There are " + s3.getSnackQuantity() + " " + s3.getSnackName() + "s left.");

      // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.buySnack(s4.getSnackCost() * 2);
        s4.subtractSnack(2);
        System.out.println(c2.getName() + " has " + "$" + c2.getWallet() + " left. " + "There are " + s4.getSnackQuantity() + " " + s4.getSnackName()+ "s left." );
       // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCash(10);
        System.out.println(c1.getName() + " finds $10, and now has $" + c1.getWallet() + " left.");

       // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.buySnack(s2.getSnackCost() * 1);
        s2.subtractSnack(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getWallet() + " left. " + "There are " + s2.getSnackQuantity() + " " + s2.getSnackName() + "s left.");

      // Add 12 more items to snack 3. Print quantity of snack 3.
        s3.addSnack(12);
        System.out.println("12 more " + s3.getSnackName() + " have been added. There are now " + s3.getSnackQuantity() + " " + s3.getSnackName() + "s left.");

       // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.buySnack(s3.getSnackCost() * 3);
        s3.subtractSnack(3);
        System.out.println(c2.getName() + " has $" + c2.getWallet() + " left. " + "There are " + s3.getSnackQuantity() + " " + s3.getSnackName() + "s left.");
    }

    public static void main(String[] args){
        workWithData();
    }
}
