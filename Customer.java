//Class for Customer
package restaurantManagementSystem;

public class Customer {
	
   private String name;
   private double discount;
   private String status;
   //Default Constructor
   Customer(){
    this.name="unknown";
    this.status="unknown";    
   }
   //Parameterized Constructor
   Customer(String name,String status){
    this.name=name;
    this.status=status;
    setDiscount(status);

   }
   //setter for customer name
    public void setName(String name){
        this.name=name;
    }
    //getter for customer name
    public String getName(){
        return name;
    }
//setter for customer status
    public void setStatus(String status){
        this.status=status;
    }
//getter for customer status
    public String getStatus(){
        return status;
    }
//setter for discount 
    public void setDiscount(String status){
        if(status.matches("active")){
           discount=10;
        }else if(status.matches("vip")){
            discount=15;

        }else {
            discount=0;
        }
    }
//getter for discount   
    public double getDiscount(){
        return discount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Name: ").append(name).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Disount(%): ").append(discount).append("\n");
        return sb.toString();
    }

}