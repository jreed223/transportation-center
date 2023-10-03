
public class Ship extends Transportation {
    private String cargo;
	public Ship(String mode, int cost, String TorR, int avgspd, int passengers, String cargo) {
		super(mode, cost, TorR, avgspd, passengers); //Constructor containing Transportation attributes
		this.cargo = cargo;
		// TODO Auto-generated constructor stub
	}
    
	
    
    public void setCargo(String cargo) {
    	this.cargo = cargo;
    }
   public String getCargo() {
	   return cargo;
   }
   
  
	
}
