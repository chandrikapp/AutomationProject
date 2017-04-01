package pack14;

public class ForEachLoop {
	
	//String name="xyz"; in real time we defining in this way
	String name=new String("xyz");
	
	public void m(){
		System.out.println(name);
	}
	
	public void mm(){
		String[] cities={"Bangalore","Hyderabad","Pune","Chennai"};
		//System.out.println(cities[2]);
		//System.out.println(cities.length);
		
		/*for each loop syntax:
		for(similar data type object:collection or array name){
			
		}*/
		
		for(String c:cities){
		System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		ForEachLoop f=new ForEachLoop();
		//f.m();  
		f.mm();
	}

}
