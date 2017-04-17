package pack20;

public class A {
	
	int a;
	int b;
	
	A(int a, int b){
		this.a=a;
		this.b=b;
	}      
	
	public void add(){
		System.out.println(a+b);
	}
	
	public void mul(){
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		A a=new A(11,22);
		a.add();
		a.mul();
	}

}
