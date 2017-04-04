package pack16;

public class Demo3 {
	
	public void m(String x){
		if(!x.isEmpty()){
			System.out.println("string length is :"+x.length());
		}
		else {
			System.out.println("given string is empty");
		}
	}
	public static void main(String[] args) {
		new Demo3().m("Hello Java");
	}

}
