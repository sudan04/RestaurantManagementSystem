package restaurantManagementSystem;

//Class for DiscountedMenuItem

class DiscountedMenuItem extends MenuItem{
	private double discount;
	
	//Default Constructor
	DiscountedMenuItem()
	{
		super();
		discount = 5;
	}
	//Parameterized Constructor
	DiscountedMenuItem(int itemNumber,String itemName,String description,double basicPrice,double discount)
	{
		super(itemNumber,itemName,description,basicPrice);
		this.discount = discount;
	}
	//setter for item type
	public void setItemType()
	{
		super.setItemType("Discounted");
	}
	//getter for price
	public double getItemPrice()
	{
		return super.getItemPrice()-((discount/100)*super.getItemPrice());
	}
	//setter for price 
	public void setItemPrice(double basicPrice,double discount)
	{
		super.setItemPrice(basicPrice);
		this.discount = discount;
	}
	//getter for discount percent
	public double getDiscount()
	{
		return discount;
	}
	@Override
	public String toString()
	{
		return "Item Type : Discounted "+"\nItem Number : "+getItemNumber()+"\nItem Name : "+getItemName()+"\nDiscount (%) : "+getDiscount()+"\nItem Price : "+getItemPrice()+"\nItem Description : "+getDescription()+"\n\n";
	}
	
}
