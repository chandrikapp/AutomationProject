package pack1;
public class Demo2 {
	
	public void m(int a){
		for(int i=1;i<=10;i++){
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.m(7);
	}
}
