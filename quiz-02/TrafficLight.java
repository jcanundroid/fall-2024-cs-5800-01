import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TrafficLight
{
	private PropertyChangeSupport support;
	private String state;

	public TrafficLight() {
		this.support = new PropertyChangeSupport(this);
		this.state = "red";
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void cycleState() {
		String newState = "";

		if (this.state == "red") {
			newState = "green";
		}
		else if (this.state == "green") {
			newState = "yellow";
		}
		else if (this.state == "yellow") {
			newState = "red";
		}

		support.firePropertyChange("state", this.state, newState);

		this.state = newState;
	}
}
