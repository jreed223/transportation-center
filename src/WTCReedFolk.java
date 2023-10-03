import java.util.Scanner;
public class WTCReedFolk {
	
		
	
	public static void main(String[] args) {
		//Water Vehicles 
		Ship WV1 = new Ship("Ship", 30, "Ticket", 20, 1000, "fruits");
		Boat WV2 = new Boat("Boat", 160, "Rental", 40, 8, "sailboat");
		Submarine WV3 =  new Submarine("Submarine", 85, "Ticket", 30, 12, 2000);
		
		//Air Vehicles
		Helicopter AV1 = new Helicopter("Helicopter", 150, "Ticket", 160, 4, 25000);
		Dirigible AV2 = new Dirigible("Dirigble", 200, "Ticket", 35, 50, 20000);
		Plane AV3 = new Plane("Plane", 150, "Ticket", 450, 200, 40000);
		HotAirBalloon AV4 = new HotAirBalloon("Hot Air Balloon", 400, "Rental", 10, 4, 2000);
		
		//Land Vehicles
		Train LV1 = new Train("Train", 100, "Ticket", 100, 70, 5);
		Automobile LV2 = new Automobile("Automobile", 60, "Rental", 50, 5, "Unleaded Premium");
		Bike LV3 = new Bike("Bike", 15, "Rental", 15, 1, "Bell");
		Bus LV4 = new Bus("Bus", 2, "Ticket", 25, 40);
		
		Scanner ui = new Scanner(System.in);
		String input2 = null;
		String input3 = "no";
		
		while(!input3.equals("yes")) { //Loop continues if input3 != yes
			System.out.println("What type of transportation do you want to use (Land, Air, Water)? ");
			String input1 = ui.nextLine();  //Reads user input
			input1 = input1.toLowerCase(); //formats user input 
			input1 = input1.trim();
			
			//Water Vehicles
			if (input1.equals("water")) { //If user enters water, it asks for a choice between 3 water vehicles
				System.out.format("%12s%6s%8s%8s%12s%n", "Mode", "Cost", "TorR", "AvgSpd", "Passengers"); //prints info about all water vehicles
				System.out.format("%12s%6d%8s%8d%12d%n", WV1.getMode(), WV1.getCost(), WV1.getTorR(), WV1.getAvgspd(), WV1.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", WV2.getMode(), WV2.getCost(), WV2.getTorR(), WV2.getAvgspd(), WV2.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", WV3.getMode(), WV3.getCost(), WV3.getTorR(), WV3.getAvgspd(), WV3.getPassengers()); 
				
				System.out.println("What mode of transportation do you want to use? (Boat, Ship, Submarine) ");
				input2 = ui.nextLine();
				input2 = input2.toLowerCase(); //formats user input
				input2 = input2.trim();
				
				switch(input2) {  //Switch statement prints object if ui matches case
				case "boat":
					System.out.println(WV2 + ", type=" + WV2.getType());
					break;
				case "ship":
					System.out.println(WV1 + ", cargo=" + WV1.getCargo());
					break;
				case "submarine":
					System.out.println(WV3 + ", maxDepth=" + WV3.getMaxDepth());
					break;
					}
				System.out.println("Are you sure this is the mode of transportation you want to use?");
				input3 = ui.nextLine();  //If user enters yes the loop stops execution
				input3 = input3.toLowerCase(); //formats user input
				input3 = input3.trim();
			
			//Air Vehicles
			}else if(input1.equals("air")) {  //If user enters air, it asks for a choice between 4 air vehicles
				System.out.format("%12s%6s%8s%8s%12s%n", "Mode", "Cost", "TorR", "AvgSpd", "Passengers"); //prints info about all air vehicles
				System.out.format("%12s%6d%8s%8d%12d%n", AV1.getMode(), AV1.getCost(), AV1.getTorR(), AV1.getAvgspd(), AV1.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", AV2.getMode(), AV2.getCost(), AV2.getTorR(), AV2.getAvgspd(), AV2.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", AV3.getMode(), AV3.getCost(), AV3.getTorR(), AV3.getAvgspd(), AV3.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", AV4.getMode(), AV4.getCost(), AV4.getTorR(), AV4.getAvgspd(), AV4.getPassengers()); 

				System.out.println("What mode of transportation do you want to use? (Helicopter, Dirigible, Plane, Hot Air Balloon) ");
				input2 = ui.nextLine();
				input2 = input2.toLowerCase(); //formats user input
				input2 = input2.trim();
				
				switch(input2) {  //Switch statement prints object if ui matches case
				case "helicopter":
					System.out.println(AV1 + ", maxHeight=" + AV1.getMaxHeight());
					break;
				case "dirigible":
					System.out.println(AV2 + ", maxHeight=" + AV2.getMaxHeight());
					break;
				case "plane":
					System.out.println(AV3 + ", maxHeight=" + AV3.getMaxHeight());
					break;
				case "hot air balloon":
					System.out.println(AV4 + ", maxHeight=" + AV4.getMaxHeight());
					break;
				}
				System.out.println("Are you sure this is the mode of transportation you want to use?");
				input3 = ui.nextLine(); //if user enters yes, loop stop executing
				input3 = input3.toLowerCase(); //formats user input
				input3 = input3.trim();
			
			//Land Vehicles	
			}else { //If user does not input water or air, it asks for a choice between 4 land vehicles
				System.out.format("%12s%6s%8s%8s%12s%n", "Mode", "Cost", "TorR", "AvgSpd", "Passengers"); //prints info about all Land vehicles
				System.out.format("%12s%6d%8s%8d%12d%n", LV1.getMode(), LV1.getCost(), LV1.getTorR(), LV1.getAvgspd(), LV1.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", LV2.getMode(), LV2.getCost(), LV2.getTorR(), LV2.getAvgspd(), LV2.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", LV3.getMode(), LV3.getCost(), LV3.getTorR(), LV3.getAvgspd(), LV3.getPassengers()); 
				System.out.format("%12s%6d%8s%8d%12d%n", LV4.getMode(), LV4.getCost(), LV4.getTorR(), LV4.getAvgspd(), LV4.getPassengers()); 
				
				System.out.println("What mode of transportation do you want to use? (Train, Automobile, Bike, Bus) ");
				input2 = ui.nextLine();
				input2 = input2.toLowerCase(); //formats user input
				input2 = input2.trim();
			
				switch(input2) {  //Switch statement prints object if ui matches case
				case "train":
					System.out.println(LV1 + ", numBoxCars=" + LV1.getNumBoxCars());
					break;
				case "automobile":
					System.out.println(LV2 + ", fuel=" + LV2.getfuel());
					break;
				case "bike":
					System.out.println(LV3 + ", accessory=" +  LV3.getAccessories());
					break;
				case "bus":
					System.out.println(LV4);
					break;
				}
				System.out.println("Are you sure this is the mode of transportation you want to use?");
				input3 = ui.nextLine(); //if user enters yes, loop stop executing
				input3 = input3.toLowerCase(); //formats user input
				input3 = input3.trim();
	
			}
			
			
		}
		System.out.println("How many passengers need to use this travel?");
				String input4 = ui.nextLine();
				int input4f = Integer.parseInt(input4);			//formats user input
				
				switch(input2) {  //Switch statement prints Cost and Travel Instructions if ui matches case
				case "boat":
					System.out.println("The total cost to travel is : $" + WV2.getTotal(input4f) + "\n" + WV2.travelDir("harbor", "10 AM")+"!" );
					break;
				case "ship":
					System.out.println("The total cost to travel is : $" + WV1.getTotal(input4f) + "\n" + WV1.travelDir("port", "3 PM")+"!" );
					break;
				case "submarine":
					System.out.println("The total cost to travel is : $" + WV3.getTotal(input4f) + "\n" + WV3.travelDir("harbor", "12 PM")+"!" );
					break;
				case "helicopter":
					System.out.println("The total cost to travel is : $" + AV1.getTotal(input4f) + "\n" + AV1.travelDir("downtown helipad", "1 PM")+"!");
					break;
				case "dirigible":
					System.out.println("The total cost to travel is : $" + AV2.getTotal(input4f) + "\n" + AV2.travelDir("stadium", "10 AM")+"!");
					break;
				case "plane":
					System.out.println("The total cost to travel is : $" + AV3.getTotal(input4f) + "\n" + AV3.travelDir("airport", "8 AM")+"!");
					break;
				case "hot air balloon":
					System.out.println("The total cost to travel is : $" + AV4.getTotal(input4f) + "\n" + AV4.travelDir("city park field", "5 PM")+"!");
					break;
				case "train":
					System.out.println("The total cost to travel is : $" + LV1.getTotal(input4f) + "\n" + LV1.travelDir("train station", "2 PM")+"!");
					break;
				case "automobile":
					System.out.println("The total cost to travel is : $" + LV2.getTotal(input4f) + "\n" + LV2.travelDir("car lot", "11 AM")+"!");
					break;
				case "bike":
					System.out.println("The total cost to travel is : $" + LV3.getTotal(input4f) + "\n" + LV3.travelDir("city park", "1 PM")+"!");
					break;
				case "bus":
					System.out.println("The total cost to travel is : $" + LV4.getTotal(input4f) + "\n" + LV4.travelDir("bus stop", "10 AM")+"!");
					break;
				}
					

		
	}


}
