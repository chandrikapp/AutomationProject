package packConstructor;

public class B {

	public B(){
		System.out.println("this is userdefined defaault constructor");
	}
	public B(int a, int b){
		this();
		System.out.println(a+b);
	}
	public B(int a, int b,int c){
		this(a,b);
		System.out.println(a+b+c);
	}
	public void m(){
		System.out.println("this is pBrBmeter less userdefined method");
	}
	
	public static void main(String[] args) {
		B b3=new B(11, 22, 33);
		b3.m();
	}

}
