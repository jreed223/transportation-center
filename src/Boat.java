
public class Boat extends Transportation{ //inherits from Transportation
	private String type;
	
	//creates Boat Object
	public Boat(String mode, int cost, String TorR, int avgspd, int passengers, String type) {
		super(mode, cost, TorR, avgspd, passengers); //Constructor containing WaterTransportation attributes along with the type attribute
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	public void setType(String type) {
    	this.type = type;
    }
   public String getType() {
	   return type;
   }

}

