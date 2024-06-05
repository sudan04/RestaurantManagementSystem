package restaurantManagementSystem;

//Class for Premium Menu Item
class PremiumMenuItem extends MenuItem{
	
	private double surcharge;
	private double itemPrice;
	
	//Default Constructor
	PremiumMenuItem()
	{
		super();
	}
	//Parameterized Constructor
	PremiumMenuItem(int number,String name,String description,double basicPrice,int surcharge)
	{
		super(number,name,description,basicPrice);
		this.surcharge = surcharge;
		setItemPrice(basicPrice,surcharge);
				
		
	}
//setter for item type
	public void setItemType()
	{
		super.setItemType("Premium");
	}

	
	//getter for Price
	public double getItemPrice()
	{
		
		return itemPrice;
	}
	//setter for price
	public void setItemPrice(double basicPrice,double surcharge)
	{
		super.setItemPrice(basicPrice);
		this.surcharge = surcharge;
		itemPrice = basicPrice + ((surcharge/100)*basicPrice);
	}
	//getter for surcharge
	public double getSurcharge()
	{
		return surcharge;
	}
	@Override
	public String toString()
	{
		return "Item Type : "+getItemType()+"\nItem Number : "+getItemNumber()+"\nItem Name : "+getItemName()+"\nSurcharge(%) : "+getSurcharge()+"\nItem Price : "+getItemPrice()+"\nItem Description : "+getDescription()+"\n\n";
	}
}

