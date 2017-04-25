package javaprograms;

public class Example1 {
	int a=30;
	int b=40;
     String name ="shiva";
	int age=25;   
	
//	String city name="kurnool";
	char C='S';
	Long number=9492561300l;

	public void m1(){
		System.out.println("name");;
		System.out.println(a+b);
	}
	public static void m2(){
		Example1 m=new Example1();
		System.out.println("name"+   "shiva");
		System.out.println((m.a+m.b)*(m.b-m.a));
		
	}
	public static void main(String[] args) {
		Example1 m=new Example1();
		m.m1();
		m2();
		
	}
}
