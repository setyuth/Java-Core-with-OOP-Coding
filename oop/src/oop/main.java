package oop;

/**
 * @author Yuth
 *
 */
public class main {
	public static void main(String[] args) {
//		Vehicle vehicle1 = new Vehicle();
//		Vehicle v1 = new Vehicle();
//		Vehicle v2 = new Vehicle();
//		System.out.println(vehicle1.counts);
//		System.out.println(v2.counts);
//		System.out.println(v1.counts);
//		System.out.println(vehicle1.getName());
//		vehicle1.setName("Audi");
//		System.out.println(vehicle1.getName());
//		
//		
//		Vehicle vehicle2 = new Vehicle("Corola", "black", "017", "Honda", "800");
//		System.out.println(vehicle2.getColor());
//		vehicle2.setColor("blue");
//		System.out.println(vehicle2.getColor());
//		System.out.println(vehicle2.getSpeed());
//		System.out.println(Vehicle.getV());
		
//		Car car = new Car("Corola", "black", "017", "Honda", "800", true, false);
//		System.out.println(car.getLedScreen());
//		System.out.println(car.getName());
		
		Vehicle vehicle1 = new Vehicle("Corola", "black", "017", "Honda", "800");
		System.out.println(vehicle1.getInfo());
		
		Vehicle vehicle2 = new Car("Corola", "black", "017", "Honda", "800", false , true);
		System.out.println(vehicle2.getInfo());
		
		Vehicle vehicle3 = new Bike("Corola", "black", "017", "Honda", "800", false);
		System.out.println(vehicle3.getInfo());
		
		
	}
}
