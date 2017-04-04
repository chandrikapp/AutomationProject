package pack15;

public class ArrayExm4 {
	
	public void m() throws InterruptedException{
		String city="Bangalore";
		char[] c=city.toCharArray();
		
		for(int i=0;i<c.length;i++){
			for(char cc:c){
			System.out.print(c[i]);
			Thread.sleep(2000);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ArrayExm4 a=new ArrayExm4();
		a.m();
	}

}
