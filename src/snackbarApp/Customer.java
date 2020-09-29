package snackbarApp;

public class Customer
{
	{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void addCash(double addCash)
	{
		this.cash += addCash;
	}

	public double cash(double cash)
	{
		return cash;
	}

	public double change(double totalCost)
	{
		this.cash = cash - totalCost;
	}
}