package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterGame lg = new LetterGame();

		int[] t1 = { 0, 1, 2, 43 };
		lg.setWord(t1);
		System.out.println("Wort = " + lg.word);

		int[] t2 = { 6, 7, 23, 7 };
		lg.setWord(t2);
		System.out.println("Wort = " + lg.word);

		int[] t3 = { 14, 2, 0, 0, 19, 19 };
		lg.setWord(t3);
		System.out.println("Wort = " + lg.word);

		lg.findCode("UNI");
		System.out.print("Code für 'UNI': ");
		lg.printA(); 

		lg.setWord(lg.a);
		System.out.println("Wiederhergestellt: " + lg.word);
	}
}
