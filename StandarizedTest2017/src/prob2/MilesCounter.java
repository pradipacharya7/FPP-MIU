package prob2;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class MilesCounter{
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		/* implement */
		
		
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
	   for(Object obj: vehicleArray)
	   {
		  if(obj instanceof Vehicle)
		  {
//			 Vehicle v = (Vehicle) obj;
			  
			  
			 vehicles.add((Vehicle) obj);
		  }
	   }
		
		
		return vehicles;
	}
	
	
	public static int computeTotalMiles(List<Vehicle>/*<implement>*/ vehicleList) {
		/*implement */
		int totalMile=0;
		for(Vehicle vec:vehicleList)
		{
		totalMile+= vec.getMilesUsedToday();	
		}
		return totalMile;
	}
}