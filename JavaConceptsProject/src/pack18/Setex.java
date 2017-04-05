package pack18;

import java.util.*;

public class Setex {

	public void roolno() {
		Set<String> numbers = new HashSet<String>();
		numbers.add("11f71a0401");
		numbers.add("11f71a0402");
       	numbers.add("11f71a0404");
		numbers.add("11f71a0405");
		numbers.add("11f71a0406");
		numbers.add("null");
		numbers.add("11f71a0404");

		for (String s : numbers) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		Setex se = new Setex();
		se.roolno();
	}

}
