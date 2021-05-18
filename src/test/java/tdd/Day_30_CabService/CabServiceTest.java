package tdd.Day_30_CabService;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CabServiceTest {
		
	CabService cabService = new CabService();
	
	@Test
	public void testCalculateFare_Should_Return_Total_Fare() {
		
		final double distance =260;
		final int minute=90;
		double totalFare=cabService.calculateFare(distance,minute);
		assertEquals(2690, totalFare,0);
	}
	
	@Test
	public void testCalculateFare_Should_Return_Min_Fare() {
		
		final double distance =0.5;
		final int minute=5;
		double totalFare=cabService.calculateFare(distance,minute);
		assertEquals(5, totalFare,0);
	}
	
	@Test
	public void testCalculateFare_Should_Return_Zero_Fare() {	
		final double distance =0.0;
		final int minute=0;
		double totalFare=cabService.calculateFare(distance,minute);
		assertEquals(0, totalFare,0);
	}
	
	@Test
	public void testCalculateTotalFare_Should_ReturnTotalFare_forMultipleRides() {	
		
		final double distance =2.3;
		final int minute=7;
		final int numOfRides=3;
		double totalFare=cabService.calculateFare(distance,minute);
		double totalFareForMultipleRides=cabService.totalFareForMultipleRides(totalFare,numOfRides);
		assertEquals(90, totalFareForMultipleRides,0);
	}
	
	@Test
	public void testShouldReturn_TotalFare_AverageFarePerRide_and_TotalNumOfRides() {	
		
		final double distance =2.3;
		final int minute=7;
		double totalFare=cabService.calculateFare(distance,minute);
		
		final int numOfRides=3;
		double totalFareForMultipleRides=cabService.totalFareForMultipleRides(totalFare,numOfRides);
		assertEquals(90, totalFareForMultipleRides,0);
		
		double averageFarePerRide=cabService.averageFarePerRide(totalFareForMultipleRides,numOfRides);
		assertEquals(30, averageFarePerRide,0);
		
		final int numberOfRides=cabService.returnNumOfRides(totalFareForMultipleRides,averageFarePerRide);
		assertEquals(3, numberOfRides ,0);
	}
}
