package pack9;

public class Demo2 extends Demo1{
	
	
public void m3() {
	System.out.println(a+b+name+name1);
		
	}
public static void main(String[] args) {
	
	Demo2 d2=new Demo2();
	d2.m1();
	Demo1.m2();
	d2.m3();
	//Demo1.m4();
}
}


