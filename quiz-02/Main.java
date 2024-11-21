public class Main
{
	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();

		Car car = new Car();
		Truck truck = new Truck();
		Motorcycle motorcycle = new Motorcycle();

		light.addPropertyChangeListener(car);
		light.addPropertyChangeListener(truck);
		light.addPropertyChangeListener(motorcycle);

		car.setBehavior(DrivingBehavior.normal);
		truck.setBehavior(DrivingBehavior.aggressive);
		motorcycle.setBehavior(DrivingBehavior.passive);

		System.out.println("Green Light:\n");
		light.cycleState();
		System.out.println("\nYellow Light:\n");
		light.cycleState();
		System.out.println("\nRed Light:\n");
		light.cycleState();

		car.setBehavior(DrivingBehavior.aggressive);

		System.out.println("\nGreen Light (car now aggressive):\n");
		light.cycleState();
	}
}
