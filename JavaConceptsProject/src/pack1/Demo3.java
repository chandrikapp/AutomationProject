package pack1;

public class Demo3 {

	public void m(int a) {
		switch (a) {

		case 1:
			System.out.println("case1 code should execute");
			System.out.println("firefox browser should open");
			break;
		case 2:
			System.out.println("case 2 code should execute");
			System.out.println("chrome browser should open");
			break;
		case 3:
			System.out.println("case 3 code should execute");
			System.out.println("intenet browser should open");
			break;
		default:
			System.out.println("default code should execute");
			System.out.println("invalid browser name");
			break;
		}

	}
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.m(1);
	}

}
