package restaurantManagementSystem;

//Class for Drink Menu Item
class DrinkMenuItem extends MenuItem{

	//Default Constructor
	DrinkMenuItem()
	{
		super();
	}
	//Parameterized Constructor
	DrinkMenuItem(int itemNumber,String itemName,String description,double basicPrice)
	{
		super(itemNumber,itemName,description,basicPrice);
	}
	//setter for item type
	public void setItemType()
	{
		super.setItemType("Drinks");
	}
	//getter for price 
	public double getItemPrice()
	{
		return super.getItemPrice();
	}
	//setter for price
	public void setPrice(double basicPrice)
	{
		super.setItemPrice(basicPrice);
	}
	
	@Override
	public String toString()
	{
		return "Item Type : "+getItemType()+"\nItem Number : "+getItemNumber()+"\nItem Name : "+getItemName()+"\nItem Price : "+getItemPrice()+"\nItem Description : "+getDescription()+"\n\n";
	}
}

