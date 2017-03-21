package pack10;

public class Demo2 {
	int c = 30;

	public void add() {
		Demo1 d2 = new Demo1();
		System.out.println(d2.a + d2.b + c);
		d2.mul();
		Demo1.div();
	}

	public static void main(String[] args) {

		Demo2 d1 = new Demo2();

		d1.add();

	}
}
