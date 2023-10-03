
public class Automobile extends Transportation{
	private String fuel;
	public Automobile(String mode, int cost, String TorR, int avgspd, int passengers, String fuel) {
		super(mode, cost, TorR, avgspd, passengers); //Constructor containing Transportation attributes 
		this.fuel = fuel;
		// TODO Auto-generated constructor stub
	}
	public void setFuel(String fuel) {
    	this.fuel = fuel;;
    }
   public String getfuel() {
	   return fuel;
   }
}
