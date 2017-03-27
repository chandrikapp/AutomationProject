package pack14;

public class WhileDemo {

	int c=20;
	
	public void m(int a){
		while(a>10){
			System.out.println("a is greater than 10");
			c=a+1;
			System.out.println(c);
			//a=c;
			break;
		}
	}
	
	public static void main(String[] args) {
		WhileDemo w=new WhileDemo();
		w.m(9);
	}
}
