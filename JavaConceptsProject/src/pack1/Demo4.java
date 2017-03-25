package pack1;

public class Demo4 {
	
	
	public void m(String browsername) {
		switch (browsername) {

		case "firefox":
			System.out.println("case1 code should execute");
			System.out.println("firefox browser should open");
			break;
		case "chrome":
			System.out.println("case 2 code should execute");
			System.out.println("chrome browser should open");
			break;
		case "internet explorer":
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
		Demo4 d=new Demo4();
		d.m("firefox");
	}

}
