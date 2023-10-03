
public class Submarine extends Transportation { //inherits from WaterTransportation
	private int maxDepth;
	//creates submarine object
	public Submarine(String mode, int cost, String TorR, int avgspd, int passengers, int maxDepth) {
		super(mode, cost, TorR, avgspd, passengers); //Constructor containing WaterTransportation attributes along with the maxDepth attribute
		this.maxDepth = maxDepth;
		// TODO Auto-generated constructor stub
	}
	
	public void setMaxDepth(int maxDepth) {
    	this.maxDepth = maxDepth;
    }
   public int getMaxDepth() {
	   return maxDepth;
   }
}
