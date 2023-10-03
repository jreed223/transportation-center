public class Transportation {
	//Transportation Attributes
	private int cost;
	private String TorR;
    private int avgspd;
    private int passengers;
    private String mode; //mode of transportation
    
    public Transportation(String mode, int cost, String TorR, int avgspd, int passengers) { //creates transportation object
    	this.mode = mode; //initializes attributes for object
        this.cost = cost;
        this.TorR = TorR;
        this.avgspd = avgspd;
        this.passengers = passengers;
    }
    
    @Override
	public String toString() {
		return  mode + ": cost=" + cost + ", TorR=" + TorR + ", avgspd=" + avgspd + "mph , passengers="
				+ passengers; //Converts object to easily read string value
	}
    
    public int getTotal(int numRiders) {  //Calculates total cost based on user input of expected riders
 		if(getTorR().equals("Rental")) { //rentals cost calculation
	    	int total = getCost();
	 		total = (numRiders/getPassengers())* getCost(); //multiplies price with number of full rental vehicles needed
	 		if(numRiders%getPassengers() != 0 ) { //adds price of one vehicle if there are remaining riders
	 			total = total + getCost();
	 		}
	 		return total;
 		}else {  //Ticket cost calculation 
 			return numRiders*getCost(); 
 		}
    }
    
    public String travelDir(String loc, String time) {  //Displays travel instructions using location and time
 	   return "Travel Instructions: Your " + getMode() +  " will be ready for you at the " + loc + " by " + time;
    }
    

  //Mutators
    public void setMode(String mode) {
        this.mode = mode;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setTorR(String torR) {
        this.TorR = torR;
    }
    public void setAvgspd(int avgspd) {
        this.avgspd = avgspd;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    //Accessors
    public String getMode() {
        return mode;
    }
    public int getCost() {
        return cost;
    }
    public String getTorR() {
        return TorR;
    }
    public int getAvgspd() {
        return avgspd;
    }
    public int getPassengers() {
        return passengers;
    }
}
