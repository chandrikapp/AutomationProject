package pack19;

public class Exce2 {
	String x="bangalore";

	public void m(String xx) {
		System.out.println("hello x");
		try{
		System.out.println(xx.length());
		}catch(Exception ex){
			//ex.printStackTrace();
			System.out.println("we cant find length for null");
		}
		System.out.println("hi y");
	}

	public static void main(String[] args) {
		new Exce2().m("yzdjfkdj");
	}

}
