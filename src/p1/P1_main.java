package p1;

public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multFrac(5, 2, 3, 4);
		Bruch a = new Bruch(5,2);
		Bruch b = new Bruch(3,4);
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

	public static void multFrac(int z1, int n1, int z2, int n2) {
		int zresult = z1 * z2;
		int nresult = n1 * n2;
		System.out.println(zresult + ":" + nresult);
	}

	public static void multFrac(Bruch a, Bruch b) {
		int zErg = a.z * b.z;
		int nErg = a.n * b.n;
		System.out.println(zErg + ":" + nErg);
	}

}
