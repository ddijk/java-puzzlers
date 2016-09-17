
import java.util.HashSet;
import java.util.Set;

public class Name2 {

	private String first, last;

	public Name2(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Name2 n) {
		return n.first.equals(first) && n.last.equals(last);
	}

	public int hashCode() {
		return 31 * first.hashCode() + last.hashCode();
	}

	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Donald", "Duck"));
		System.out.println(
			s.contains(new Name("Donald", "Duck")));
	}
}
