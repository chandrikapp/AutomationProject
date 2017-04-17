package pack19;

public class Exce1 {
	
	public void m() throws InterruptedException{
		System.out.println("Hello");
		Thread.sleep(3000);
		System.out.println("Hi");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Exce1().m();
	}

}
