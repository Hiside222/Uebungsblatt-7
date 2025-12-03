package p1;

public class Bruch {

	public int z;
	public int n;

	public Bruch(int zaehler, int nenner) {
		z = zaehler;
		n = nenner;
	}

	@Override
	public String toString() {
		return z + ":" + n;
	}
}
