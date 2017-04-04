package pack16;

public class Demo2 {
	
	String name1="xyz";
	String name2="  XYZ";
	
	String orderId="TransactionId#767787#Hello";
	
	String[] s=orderId.split("#");
	//String[] s={"TransactionId","767787","Hello"};
	
	String str="Hello Java";

	public void m(){
		System.out.println(name1.equals(name2.toLowerCase().trim()));
		System.out.println(name1.equalsIgnoreCase(name2.trim()));
		//System.out.println(name1.compareTo(name2.toLowerCase().trim()));
		System.out.println();
		for(String s1:s){
			System.out.println(s1);
		}
		/*System.out.println(s[0]);
		System.out.println(s[1]);*/
		System.out.println(str);
		
	}
	public void mm() throws InterruptedException{
		System.out.println(str);
		String ss=str.replace("o", "");
		char[] sss=ss.toCharArray();
		for(int i=0;i<sss.length;i++){
		System.out.print(sss[i]);
		Thread.sleep(2000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		//new Demo2().m();
		new Demo2().mm();
	}
}
