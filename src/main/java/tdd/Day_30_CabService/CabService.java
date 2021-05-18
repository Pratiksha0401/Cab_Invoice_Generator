package tdd.Day_30_CabService;

public class CabService {

	double totalfare=0;
	double totalFareForMultipleRides;
	double averagefarePerRide;
	
	public double calculateFare(final double distance, final int minute) {
		
		
		if(distance==0.0 && minute==0) {
			return totalfare=0;			
		}
			
		if(distance < 1.0 && minute<=5 ) {
			return totalfare=5;
		}
		totalfare=(distance*10) + minute;
		
		return totalfare;
	}

	public double totalFareForMultipleRides(final double totalFare2, final int numOfRides) {
		
		totalFareForMultipleRides = totalFare2 * numOfRides;
		
		return totalFareForMultipleRides;
	}

	public double averageFarePerRide(double totalFareForMultipleRides, int numOfRides) {
		
		averagefarePerRide=(totalFareForMultipleRides / numOfRides);
		
		return averagefarePerRide;
	}

	public int returnNumOfRides(double totalFareForMultipleRides2, double averageFarePerRide2) {

		int numOfRides= (int) ( totalFareForMultipleRides2 / averageFarePerRide2 );
		return numOfRides;
	}
}
