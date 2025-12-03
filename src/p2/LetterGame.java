package p2;

public class LetterGame {

	public String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
	public String word = "";
	public int[] a;

	public void setWord(int[] a) {
		word = "";
		for (int index : a) {
			if (index >= 0 && index < keyString.length()) {
				word = word + keyString.charAt(index);
			}
		}
	}

	public void findCode(String s) {
		a = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int pos = keyString.indexOf(c);
			a[i] = pos;
		}
	}

	public void printA() {
		if (a == null) {
			System.out.println("a ist nicht belegt.");
			return;
		}
		System.out.print("{ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1)
				System.out.print(", ");
		}
		System.out.println(" }");
	}
}