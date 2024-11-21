public interface DrivingBehavior {
	public String[] drive();

	DrivingBehavior aggressive = () -> (new String[] { "Slam Brake", "Faster", "Need4Speed" });
	DrivingBehavior normal = () -> (new String[] { "Stop", "Slow", "Go" });
	DrivingBehavior passive = () -> (new String[] { "Stop", "Slower", "Go Slow" });
}
