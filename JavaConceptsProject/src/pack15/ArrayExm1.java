package pack15;

public class ArrayExm1 {
	
	public void m(){
		int[] a=new int[4];//declaration int array
		a[0]=200;
		a[3]=100;
		for(int i:a){
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println(a[0]+a[3]);
	}
	
	public void m1(){
		int[] i1={11,21,43,54};//initialization int array
		for(int i=0;i<=i1.length-2;i++){
			System.out.println(i1[i]);
		}
	}
	
	public static void m2(int size,int x){
		if(x>=size){
		String[] names=new String[size+x];

		/*names[0]="xyz";*/
		for(String s:names){
			System.out.println(s);
		}
		/*for(x=0;x<size+1;x++){
			System.out.println(names[x]);
		}*/
		}
	}
	
	
	
	public static void main(String[] args) {
		ArrayExm1 a1=new ArrayExm1();
		//a1.m();
		//a1.m1();
		m2(3,4);
	}

}
