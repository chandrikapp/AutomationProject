package pack12;

public class Demo1 {

	int cutoffmarks = 35;
	int maxMarks=100;

	public void marks(float f) {

		if (f >= cutoffmarks&&f<=maxMarks) {
			System.out.println("pass:" + f);

		} else if (f < cutoffmarks &&f>=0) {

			System.out.println("fail:" + f);

		} else {
			System.out.println("please enter valid nuber");
		}
	}

	public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		d1.marks(68.5f);
		d1.marks(6);
		d1.marks(101.3f);

	}
}
