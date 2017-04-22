package pack1;

public class Demo6 {
	int a=30;
	static String name ="siva";
	public void m1(){
		int b=45;
		System.out.print("hi shiva:"+" age:"+a+" name:"+name);
		
		

}
	public static void m2(){
		int c=55;
		
		Demo6 m=new Demo6();
		System.out.println("hello "+"Age:"+m.a+c+name);
		
	}
	public static void main(String[] args) {
		Demo6 m=new Demo6();
		m.m1();
		m2();
		
	}
}