package snackbarApp;

import java.text.DecimalFormat;

public class Main 
{   
    private static void workWithData()
    {
        System.out.println("Welcome to the Lambda Snack Bar!!!");

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 1.75, 36, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 1.0, 36, food.getId());
        Snack pretzel = new Snack("Pretzel", 2.0, 30, food.getId());
        Snack soda = new Snack("Soda", 2.5, 24, drink.getId());
        Snack water = new Snack("Water", 2.75, 20, drink.getId());

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        System.out.println();
        soda.buySnack(3);
        jane.buySnacks(soda.getTotalCostWithQuantity(3));
        System.out.println("Customer " + jane.getId() + " cash on hand $" + jane.getCashOnHand());
        System.out.println("Quanity of snack " + soda.getId() + " is " + soda.getQuantity());

        System.out.println();
        pretzel.buySnack(1);
        jane.buySnacks(pretzel.getTotalCostWithQuantity(1));
        System.out.println("Customer " + jane.getId() + " cash on hand $" + jane.getCashOnHand());        
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        System.out.println();
        soda.buySnack(2);
        bob.buySnacks(soda.getTotalCostWithQuantity(2));
        System.out.println("Customer " + bob.getId() + " cash on hand $" + bob.getCashOnHand());        
        System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

        System.out.println();
        jane.addCash(10);
        System.out.println("Customer " + jane.getId() + " cash on hand $" + jane.getCashOnHand());

        System.out.println();
        chocolateBar.buySnack(1);
        jane.buySnacks(chocolateBar.getTotalCostWithQuantity(1));
        System.out.println("Customer " + jane.getId() + " cash on hand " + jane.getCashOnHand());
        System.out.println("Quantity of snack " + chocolateBar.getId() + " is " + chocolateBar.getQuantity());

        System.out.println();
        pretzel.addQuantity(12);
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        System.out.println();
        pretzel.buySnack(3);
        bob.buySnacks(pretzel.getTotalCostWithQuantity(3));
        System.out.println("Customer " + bob.getId() + " cash on hand $" + bob.getCashOnHand());
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        System.out.println();
        System.out.println("Stretch Goals");
        System.out.println();

        DecimalFormat dFormat = new DecimalFormat("$####,###,###.00");

        System.out.println("Snack: " + chips.getName());
        System.out.println("Vending Machine: " + food.getName());
        System.out.println("Quantity: " + chips.getQuantity());
        System.out.println("Total Cost: " + dFormat.format(chips.getTotalCostWithQuantity(chips.getQuantity())));

        System.out.println();
        System.out.println("Snack: " + chocolateBar.getName());
        System.out.println("Vending Machine: " + food.getName());
        System.out.println("Quantity: " + chocolateBar.getQuantity());
        System.out.println("Total Cost: " + dFormat.format(chocolateBar.getTotalCostWithQuantity(chocolateBar.getQuantity())));

        System.out.println();
        System.out.println("Snack: " + pretzel.getName());
        System.out.println("Vending Machine: " + food.getName());
        System.out.println("Quantity: " + pretzel.getQuantity());
        System.out.println("Total Cost: " + dFormat.format(pretzel.getTotalCostWithQuantity(pretzel.getQuantity())));

        System.out.println();
        System.out.println("Snack: " + soda.getName());
        System.out.println("Vending Machine: " + drink.getName());
        System.out.println("Quantity: " + soda.getQuantity());
        System.out.println("Total Cost: " + dFormat.format(soda.getTotalCostWithQuantity(soda.getQuantity())));
        
        System.out.println();
        System.out.println("Snack: " + water.getName());
        System.out.println("Vending Machine: " + drink.getName());
        System.out.println("Quantity: " + water.getQuantity());
        System.out.println("Total Cost: " + dFormat.format(water.getTotalCostWithQuantity(water.getQuantity())));
    } 
    public static void main(String[] args)
    {
        workWithData();
    }
}