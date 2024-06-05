package restaurantManagementSystem;

public class RestaurantDriver {

	public static  void main (String[] args)
	{
		try {
		Menu menu1 = new Menu(1,"Dine In","BreakFast","Main Venue","Early Morning");
		MenuItem smi = new StandardMenuItem(3,"Pancake","Made with Butter and made from wheat flour",300);
		MenuItem pmi = new PremiumMenuItem(4,"Cookies","Made with all premium ingredents",300,20);
		DiscountedMenuItem dmi = new DiscountedMenuItem(5,"HamBurger","Delecious and Huge",250,20);
		
		menu1.addMenuItem(1,"Bread","Fried with Ghee",100);
		menu1.addMenuItem(2,"Omlet","Half Fried and Full Fried Available",200);
		menu1.addMenuItem(smi);
		menu1.addMenuItem(pmi);
		menu1.addMenuItem(dmi);
		Customer customer = new Customer("Anish Paudel","vip");
		
		
		Frame1.run(menu1,menu1);
		
//		System.out.println(menu1);
//		menu1.displayMenuItems();
//		System.out.println(invoice1.generateInvoice());
		
     	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
