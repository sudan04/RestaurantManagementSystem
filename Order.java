//class for order
package restaurantManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {

private List<MenuItem> items;
private Customer customer;


//Default constructor 
Order()
{
	items = new ArrayList<>();
	customer = new Customer();

}
//Parameterized Constructor
Order(Customer customer)
{
	items = new ArrayList<>();
	this.customer = customer;

}
//method to add item in order list
public void addOrderItem(Menu menu, int itemNumber)
{
	List<MenuItem> mi = menu.getMenuItems();
	for(MenuItem item: mi)
	{
		if(item.getItemNumber()==itemNumber)
			items.add(item);
	}
}

//method to remove item in order list
public void removeOrderItem(int itemNumber)
{
	Iterator<MenuItem> iterator = items.iterator();
	while(iterator.hasNext())
	{
		MenuItem item = iterator.next();
		if(item.getItemNumber()==itemNumber)
		    iterator.remove();
	}
//	for(MenuItem item: getOrderItem())
//	{
//		if(item.getItemNumber()==itemNumber)
//			items.remove(item);
//	}
}

//getter for order items
public List<MenuItem> getOrderItem()
{
	return items;
}
//getter for Customer
public Customer getCustomer()
{
	return customer;
}
//setter for Customer
public void setCustomer(Customer customer)
{
	this.customer = customer; 
}
//getter for total amount
public double getTotalAmount()
{
	double amount = 0;
	for(MenuItem item:items)
	{
		amount += item.getItemPrice();
	}
	return amount;
	
}

//getter for  payable Amount
public double getPayableAmount()
{
	double amount = getTotalAmount();
	return amount - (amount*(customer.getDiscount()/100));
}
//getter for total discounted amount
public double getdiscountedAmount()
{
  double amount = getTotalAmount();
   return amount-getPayableAmount();
}
@Override 
public String toString()
{
	StringBuilder sb = new StringBuilder();
//	sb.append("Order => ").append("\n");
//	sb.append(customer).append("\n");
	for(MenuItem item:items)
	{
	sb.append(item).append("\n");
	}
	return sb.toString();
}
}
