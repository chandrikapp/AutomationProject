package pack16;

public class Revers {

	String s = "seetha is a good girl";

	public void revers() {
		System.out.println("given string: " + s);
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {

			System.out.print("Reverse String; " + c[i]);
		}

	}

	public static void main(String[] args) {
		Revers r = new Revers();
		r.revers();

	}

}
