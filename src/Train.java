
public class Train extends Transportation {
	//creates Train Object
	private int numBoxCars;
		public Train(String mode, int cost, String TorR, int avgspd, int passengers, int numBoxCars) {
			super(mode, cost, TorR, avgspd, passengers); //Constructor containing Transportation attributes 
			this.numBoxCars = numBoxCars;
			// TODO Auto-generated constructor stub
		}
		
		public void setNumBoxCars(int numBoxCars) {
	    	this.numBoxCars = numBoxCars;
	    }
	   public int getNumBoxCars() {
		   return numBoxCars;
	   }

}
