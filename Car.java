package selenium;

public class Car {
	
	public void driveCar() {
		System.out.println("Drive Car");
	}
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	
	public void  turnonAirconditioner() {
		System.out.println("TurnonAirconditioner");
	}
public static void main(String[] args) {
	Car car=new Car();
	car.driveCar();
	car.applyBreak();
	car.turnonAirconditioner();
}
}
