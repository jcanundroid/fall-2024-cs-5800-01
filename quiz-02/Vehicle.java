import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class Vehicle implements PropertyChangeListener
{
	private String type;
	private DrivingBehavior behavior;

	public Vehicle(String type) {
		this.type = type;
		this.behavior = DrivingBehavior.normal;
	}

	public void propertyChange(PropertyChangeEvent event) {
		String lightState = (String)event.getNewValue();
		String[] speeds = this.behavior.drive();
		String speed = "";

		if (lightState == "red") {
			speed = speeds[0];
		}
		else if (lightState == "yellow") {
			speed = speeds[1];
		}
		else if(lightState == "green") {
			speed = speeds[2];
		}

		System.out.println(this.type + ": " + speed);
	}

	public void setBehavior(DrivingBehavior behavior) {
		this.behavior = behavior;
	}
}
