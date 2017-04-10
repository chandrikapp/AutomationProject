package pack19;

public class A {
	
	public A(){
		System.out.println("Hello");
	}
	
	public A(int a, int b){
		this();//instead of constructor name should use this keyword
		System.out.println(a+b);
	}
	
	public void m1(){
		System.out.println("Hello x");
	}
	public void m2(String str){
		m1();
		System.out.println("Hello y  "+str);
	}

	public static void main(String[] args) {
		//A a=new A();
		A a1=new A(11,22);
		//a1.m1();
		a1.m2("I am good");
	}
}
