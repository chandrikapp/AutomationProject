package pack9;

public abstract class Demo1 {
	 int a=10;
	 static int b=20;
	String name="chandu";
	 static String name1="indu";
	
	public void m1(){
		System.out.println(a+b+name+name1);
		
	}
	public static void m2(){
		
		System.out.println(b+name1);
		
	}
	public abstract  void m3();
	//public abstract static void m4();

}
