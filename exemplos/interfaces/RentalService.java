package interfaces;

import java.time.Duration;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxServices taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
		
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60;
		
		double basicPayments;
		if(hours<=12) {
			basicPayments = pricePerHour*Math.ceil(hours);
		} else {
			basicPayments = pricePerDay * Math.ceil(hours/24);
		}
		
		double tax = taxService.tax(basicPayments);
		
		carRental.setInvoice(new Invoice(basicPayments, tax));
	}
	
}
