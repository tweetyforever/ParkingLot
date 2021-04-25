
public class ParkingTest {

	public static void main(String[] args) {
		try {
			ParkingSystem parkingSystem1 = new ParkingSystem(1000, 1, 1);
			System.out.println(parkingSystem1.addCar(2));
			System.out.println(parkingSystem1.addCar(1));
			System.out.println(parkingSystem1.addCar(3));
			System.out.println(parkingSystem1.addCar(2));
			System.out.println(parkingSystem1.addCar(1));
			System.out.println(parkingSystem1.addCar(3));
		}
		catch(Exception e) {
			System.out.println("parkingSystem1 cannot be created");
		}
		
		try {
			ParkingSystem parkingSystem2 = new ParkingSystem(1, 1, 1);
			System.out.println(parkingSystem2.addCar(2));
			System.out.println(parkingSystem2.addCar(1));
			System.out.println(parkingSystem2.addCar(3));
			System.out.println(parkingSystem2.addCar(2));
			System.out.println(parkingSystem2.addCar(1));
			System.out.println(parkingSystem2.addCar(3));
		}
		catch(Exception e) {
			System.out.println("parkingSystem2 cannot be created");
		}
		
		try {
			ParkingSystem parkingSystem2 = new ParkingSystem(-1, 1, 1);
			System.out.println(parkingSystem2.addCar(2));
			System.out.println(parkingSystem2.addCar(1));
			System.out.println(parkingSystem2.addCar(3));
			System.out.println(parkingSystem2.addCar(2));
			System.out.println(parkingSystem2.addCar(1));
			System.out.println(parkingSystem2.addCar(3));
		}
		catch(Exception e) {
			System.out.println("parkingSystem2 cannot be created");
		}
		
		try {
			ParkingSystem parkingSystem2 = new ParkingSystem(1, 1, 1);
			System.out.println(parkingSystem2.addCar(4));
			System.out.println(parkingSystem2.addCar(1));
			System.out.println(parkingSystem2.addCar(3));
			System.out.println(parkingSystem2.addCar(2));
			System.out.println(parkingSystem2.addCar(1));
			System.out.println(parkingSystem2.addCar(3));
		}
		catch(ParkingLotInitializationException e) {
			System.out.println("parkingSystem2 cannot be created");
		}
		catch(InvalidCarTypeException e) {
			System.out.println("Wrong car type");
		}
		
		ParkingSystem parkingSystem4;
		try {
			parkingSystem4 = new ParkingSystem(1, 1, 1);	
			try {
				System.out.println(parkingSystem4.addCar(0));
				System.out.println(parkingSystem4.addCar(1));
				System.out.println(parkingSystem4.addCar(3));
				System.out.println(parkingSystem4.addCar(2));
				System.out.println(parkingSystem4.addCar(1));
				System.out.println(parkingSystem4.addCar(3));
			}
			catch(Exception e) {
				System.out.println("Wrong car type");
			}
		}
		catch(Exception e) {
			System.out.println("parkingSystem4 cannot be created");
		}
		
	}

}
