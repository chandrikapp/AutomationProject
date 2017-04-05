package pack17;

public class Rev {

	String name="Seetha is a good girl";
	
	public void method(){
		System.out.println(name);
		char[] c= name.toCharArray();
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(c[i]);
			
		}	
	}
	public static void main(String[] args) {
		Rev r=new Rev();
		r.method();
	}
	
}
