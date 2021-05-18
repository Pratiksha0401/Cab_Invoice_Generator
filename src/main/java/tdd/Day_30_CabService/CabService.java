package tdd.Day_30_CabService;

public class CabService {

	double totalfare=0;
	double totalFareForMultipleRides;
	double averagefarePerRide;
	
	public double calculateFare(final double distance, final int minute) {
		
		totalfare=(distance*10) + minute;
		
		if(totalfare==0.0) {
			return totalfare=0;			
		}
			
		if(totalfare<5.0 ) {
			return totalfare=5;
		}
		
		return totalfare;
	}

	public double calculateTotalFare(Ride[] rides) {
		for(Ride ride:rides) {
			totalfare+=this.calculateFare(ride.distance, ride.minute);
		}
		return totalfare;
	}

	public double averagefarePerRide(double totalFare2, int length) {
		averagefarePerRide=totalFare2/length;
		return averagefarePerRide;
	}
	
	public int returnNumOfRides(double totalFareForMultipleRides2, double averageFarePerRide2) {

		int numOfRides= (int) ( totalFareForMultipleRides2 / averageFarePerRide2 );
		return numOfRides;
	}
}
