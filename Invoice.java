
package restaurantManagementSystem;
//Class for Invoice 
public class Invoice {

	private Order order;
	//Default Counstructor
	Invoice()
	{
		order = new Order();
	}
	//Parameterized Constructor
	Invoice(Order order)
	{
		this.order = order;
	}
	//method to generate invoice
	public String generateInvoice()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Invoice : \n").append(order.getCustomer()+"\n");
		sb.append(order+"\n");
		return sb.toString();	
	}
	//method to generateAmount
	public String generateAmount()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Total Amount : ").append(order.getTotalAmount()+"\n");
		sb.append("Status Discount Amount : ").append(order.getdiscountedAmount()+"\n");
		sb.append("Total Payable Amount : ").append(order.getPayableAmount());
		return sb.toString();
	}
	//getter for payable amount
	double generatePayableAmount()
	{
		return order.getPayableAmount();
	}
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Invoice : \n").append(order.getCustomer()+"\n");
		sb.append(order+"\n");
		sb.append("Total Amount : ").append(order.getTotalAmount()+"\n");
		sb.append("Status Discount Amount : ").append(order.getdiscountedAmount()+"\n");
		sb.append("Total Payable Amount : ").append(order.getPayableAmount());
		return sb.toString();
	}
	
}
