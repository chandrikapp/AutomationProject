package pack16;

public class Demo1 {
	
	String city="how are you";
	String name="XYZ";
	String str="   Hello    Hi";//HelloHi
	
	String s=str.trim();//Hello   Hi
	String s1=s.substring(0, 5);//Hello
	String s2=s.substring(5);   //Hi
	
	public void stringMethods(){
		System.out.println(city.length());
		System.out.println(city.charAt(3));
		System.out.println(city.charAt(4));
		System.out.println(city.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 8));
		System.out.println(str.substring(8));
		System.out.println(str.substring(8).trim());
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1+" "+s2.trim());
	}
	
	public static void main(String[] args) {
		new Demo1().stringMethods();
	}
	
	

}
