
public class ParkingSystem {
	private int big;
	private int medium;
	private int small;
	
	public ParkingSystem(int big, int medium, int small) throws ParkingLotInitializationException {
		if(big < 0 || medium < 0 || small < 0) {
			throw new ParkingLotInitializationException("Do not enter negative number for any car type.");
		}
		if((big+medium+small) > 1000) {
			throw new ParkingLotInitializationException("There is a maximum of 1000 available parking spaces.");
		}
		this.big = big;
		this.medium = medium;
		this.small = small;
	}
	
	public boolean addCar(int carType) throws InvalidCarTypeException{
		if(carType < 1 || carType > 3) {
			throw new InvalidCarTypeException("Car type should be between 1-3");
		}
		if(carType == 1) {
			if(big > 0) {
				big--;
				return true;
			}
		}
		else if(carType == 2) {
			if(medium > 0) {
				medium--;
				return true;
			}
		}
		else {
			if(small > 0) {
				small--;
				return true;
			}
		}		
		return false;
	}
}
