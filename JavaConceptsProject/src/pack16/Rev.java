package pack16;

public class Rev {
	
	String str="Java Consepts";
	public void method()
	{
		System.out.println("enter string: "+str);
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i<=0;i++){
			System.out.print("after reverse string: "+ch[i]);
		}
		
	}
	public static void main(String[] args) {
		Rev r=new Rev();
		r.method();;
	}

}
