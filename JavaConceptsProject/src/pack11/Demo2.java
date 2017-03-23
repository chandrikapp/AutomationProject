package pack11;

public class Demo2 {

	int a = 10;
	int b = 20;
	

	public void m() {

		if (a > b) {
			System.out.println("a is big");
		} else if (b > a) {
			System.out.println("b is big");
		}
	}
	
	public void mm(int a, int b){
		if (a > b) {
			System.out.println("a is big");
		} else if (b > a) {
			System.out.println("b is big");
		}
	}
	
	String preBanCity="Bangalore";
	String preHydCity="Hyderabad";
	public void mmm(String name,String city){
		if(name.equals(name)&&city.equalsIgnoreCase(preBanCity)){
			System.out.println("hello how are you   :"+name+"  and he is from  :"+city);
		}
		else if(name.equals(name)&&city.equalsIgnoreCase(preHydCity)){
			System.out.println("hello how are you   :"+name+"  and he is from  :"+city);
		}
		else{
			System.out.println("no data found .....");
		}
		
	}
	
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		//d.m();
		
		//d.mm(a, b);
		d.mmm("Shiva", "HYDERABAD");
		//d.mmm("Govardhan", "Baengalore");
	}

}
