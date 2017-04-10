package pack19;

public class BB extends AA {

	int a=10;
	int b=20;
	public void mul(){
		System.out.println(super.a*b);
	}
	
	public static void main(String[] args) {
		BB b=new BB();
		b.add();
		b.mul();
	}
}
