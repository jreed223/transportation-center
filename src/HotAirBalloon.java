
public class HotAirBalloon extends Transportation{
	private int maxHeight;
	//creates Hot Air Balloon Object
		public HotAirBalloon(String mode, int cost, String TorR, int avgspd, int passengers, int maxHeight) {
			super(mode, cost, TorR, avgspd, passengers); //Constructor containing Transportation attributes along with the maxHeight attribute
			this.maxHeight = maxHeight;
			// TODO Auto-generated constructor stub
		}
		
		public void setMaxHeight(int maxHeight) {
	    	this.maxHeight = maxHeight;
	    }
	   public int getMaxHeight() {
		   return maxHeight;
	   }
}
