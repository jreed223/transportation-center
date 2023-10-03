
public class Bike extends Transportation{
	private String accessories;
	public Bike(String mode, int cost, String TorR, int avgspd, int passengers, String accessories) {
		super(mode, cost, TorR, avgspd, passengers); //Constructor containing Transportation attributes 
		this.accessories = accessories;
		// TODO Auto-generated constructor stub
	}
	public void setAccessories(String accessories) {
    	this.accessories = accessories;
    }
   public String getAccessories() {
	   return accessories;
   }
}
