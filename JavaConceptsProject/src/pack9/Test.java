package pack9;

public class Test extends A{

	public void m5() {
		
	}
	
	public void m6(){
		
	}
	
	
	public static void main(String[] args) {
		//Test t=new Test();
		//A a=new A();
		
		A a1=new Test();
		a1.m1();
		A.m2();
		a1.m5();

	}

}
