package µÚÎåÌì;

public class firstTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber();
	}
	public static void printNumber() {
		int count = 0;
		for (int a = 0; a < 100; a++) {
			if (a / 10 == 9 || a % 10 == 9) {
				continue;
			}
			if (count % 5 == 0) {
				System.out.println();
			}
			count++;
			System.out.print(a + " ");
		}
	}
}
