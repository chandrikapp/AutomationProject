package pack1;

public class Tables {
		
		public void table(int a){
			System.out.println("********* "+a+" Table**********");
			for(int i=1;i<=10;i++){
				
				for(int j=1;j<=10;j++){
					int k=i*j;
				
					
					System.out.println(i+" * "+j+" = "+k);
				}
			}
		
		}
		
		public static void main(String[] args) {
			
			Tables t=new Tables();
			t.table(1);
		}
		
	}
	


