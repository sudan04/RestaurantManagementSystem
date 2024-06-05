package restaurantManagementSystem;

//Class for Standard Menu Item
class StandardMenuItem extends MenuItem{
	// Default Constructor
	StandardMenuItem()
	{
	  super();
	}
	// Parameterized Constructor
	StandardMenuItem(int itemNumber,String itemName,String description,double basicPrice)
	{
		super(itemNumber,itemName,description,basicPrice);
	}
	//setter for item, type
	public void setItemType()
	{
		super.setItemType("Standard");
	}
	//getter for price
	public double getItemPrice()
	{
		return super.getItemPrice();
	}
	//setter for price
	public void setItemPrice(double itemPrice)
	{
	    super.setItemPrice(itemPrice);
	}
	@Override
	public String toString()
	{
		 return "Item Type : "+getItemType()+"\nItem Number : "+getItemNumber()+"\nItem Name : "+getItemName()+"\nItem Price : "+getItemPrice()+"\nItem Description : "+getDescription()+"\n\n";
	}
	
}

