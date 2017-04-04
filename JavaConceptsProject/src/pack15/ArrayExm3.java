package pack15;

public class ArrayExm3 {
	
	public void m(){
		int[][] x=new int[2][3];//two dimension array declaration
		x[0][1]=100;
		x[1][1]=300;
		/*for(int row=0;row<2;row++){
			for(int col=0;col<3;col++){
				System.out.print(x[row][col]+"\t");
			}
		}*/
		for(int[] i:x){
			for(int ii:i){
				System.out.print(ii+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ArrayExm3 a=new ArrayExm3();
		a.m();
	}

}
