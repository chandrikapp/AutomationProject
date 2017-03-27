package pack14;

public class DoWhileLoop {

	public void m(int a){
		do{
			System.out.println("a is greater than 10");
			break;
		}while(a>10);
	}
	public static void main(String[] args) {
		DoWhileLoop d=new DoWhileLoop();
		d.m(11);
	}
	
}
