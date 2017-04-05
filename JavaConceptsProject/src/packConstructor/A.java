package packConstructor;

public class A {

	public A(){
		System.out.println("this is userdefined default constructor");
	}
	public A(int a, int b){
		System.out.println(a+b);
	}
	public A(int a, int b,int c){
		System.out.println(a+b+c);
	}
	
	public void m(){
		System.out.println("this is parameter less userdefined method");
	}
	
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(11,33);
		A a3=new A(11, 22, 33);
		
		a3.m();
	}
}
