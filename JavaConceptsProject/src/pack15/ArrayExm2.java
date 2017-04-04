package pack15;

public class ArrayExm2 {
	
	public void m1(int size){
		float  f[]=new float[size];
		for(float f1:f){
			System.out.println(f1);
		}
	}

	public static void main(String[] args) {
		ArrayExm2 a=new ArrayExm2();
		a.m1(4);
	}
}
