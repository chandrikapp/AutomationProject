package pack1;

public class Tablee {

	public void table(int a) {
		System.out.println("****** " + a + " Table *******");

		for (int i = 1; i <= 10; i++) {
			int k = a * i;
			System.out.println(a + " *" + i + " =" + k);
		}
	}

	public static void main(String[] args) {
		Tablee t1 = new Tablee();
		t1.table(2);
	}
}
