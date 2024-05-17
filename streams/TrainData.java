package streams;

import java.util.HashMap;
import java.util.Map;

class Train {

}
public class TrainData
{
	private int trainNumber;
	private String trainName;
	Map <String, Map<String,Integer>> routes;
	
	public TrainData(int trainNumber, String trainName) {
		//TODO Auto-generated constructor stub
		this.trainName = trainName;
		this.trainNumber = trainNumber;
	}
	
	 // Method to add a route with its cost
    public static void addRoute(Map<String, Map<String, Integer>> routes, String source, String destination, int cost) {
        routes.computeIfAbsent(source, k -> new HashMap<>()).put(destination, cost);
    }
	
    public static void main(String[] args) {
        // Create a nested HashMap to store route costs
        Map<String, Map<String, Integer>> routes = new HashMap<>();

        // Add some routes with associated costs
        addRoute(routes, "NNN", "NCJ", 200);
        addRoute(routes, "VLY", "MAS", 410);
        addRoute(routes, "NCJ", "MAS", 450);
        addRoute(routes, "MAS", "TEN", 400);
        addRoute(routes, "MAS", "CGL", 385);

        // Retrieve and print the cost of a specific route
        int costNYtoLA = getRouteCost(routes, "NNN", "NCJ");
        System.out.println("Cost from NNN to NCJ: ₹" + costNYtoLA);
        // Retrieve and print the cost of a specific route
        int costMAStoTEN = getRouteCost(routes, "MAS", "TEN");
        System.out.println("Cost from MAS to TEN: ₹" + costMAStoTEN);
        
        int costMAStoCGL = getRouteCost(routes, "MAS", "CGL");
        System.out.println("Cost from MAS to CGL: ₹" + costMAStoCGL);

        // Try to retrieve a route that doesn't exist
        int costNYtoSF = getRouteCost(routes, "NCJ", "MAS");
        System.out.println("Cost from NCJ to MAS: $" + costNYtoSF); // Expected to be -1 or some default value
    }
 // Method to get the cost of a route
    public static int getRouteCost(Map<String, Map<String, Integer>> routes, String source, String destination) {
        Map<String, Integer> destinations = routes.get(source);
        if (destinations != null && destinations.containsKey(destination)) {
            return destinations.get(destination);
        } else {
            return -1; // Return -1 or some default value if the route doesn't exist
        }
    }
    
    
	
}
