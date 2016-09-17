
public class Dog3 extends Exception {

	public static final Dog3 INSTANCE = new Dog3();

	private Dog3() {
	}

	public String toString() {
		return "Woof";
	}
}
