
public class MyThing extends Thing {

	private final int arg;

	/*
	 * This constructor is illegal. Rewrite it so that it has the same
	 * effect but is legal.
	 */
	public MyThing(int i) {
		super(i);
		arg = i;
		// super(arg = (int)System.currentTimeMillis());
	}
}
