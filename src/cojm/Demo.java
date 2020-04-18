package cojm;

public class Demo {

	public static void main(String[] args) {

		String days = "monday";

		switch (days) {
		case "monday":
			System.out.println("weekday");
			break;
		case "wendsday":
			System.out.println("weekday");
			break;
		case "saturday":
			System.out.println("weekend");
			break;
		default:
			System.out.println("enter valid day");
			break;
		}
	}
}
