
import java.util.Arrays;
import java.util.List;

public class Pair<T> {

	private final T first;
	private final T second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T first() {
		return first;
	}

	public T second() {
		return second;
	}

	public List<java.lang.String> stringList() {
		return Arrays.asList(java.lang.String.valueOf(first),
			java.lang.String.valueOf(second));
	}

	public static void main(String[] args) {
		Pair p = new Pair<Object>(23, "skidoo");
		System.out.println(p.first() + " " + p.second());
//		for (java.lang.String s : p.stringList()) {
//			System.out.print(s + " ");
//		}
	}
}
