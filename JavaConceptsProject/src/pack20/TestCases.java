package pack20;

public class TestCases {

	String username;
	String password;
	TestCases(String uname,String pwd){
		username=uname;
		password=pwd;
	}
	
	public void tc1(){
		System.out.println(username+"   "+password);
		System.out.println("should execute remaining tc1 flow");
	}
	
	public void tc2(){
		System.out.println(username+"   "+password);
		System.out.println("should execute remaining tc2 flow");
	}
	public static void main(String[] args) {
		TestCases t=new TestCases("Hello", "132434");
		t.tc1();
		t.tc2();
	}
}
