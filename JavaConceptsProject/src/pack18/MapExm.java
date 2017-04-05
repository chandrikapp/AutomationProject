package pack18;

import java.util.*;
import java.util.Map.Entry;

public class MapExm {

	public void m() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "x");
		map.put(200, "y");
		map.put(103, "x");
		map.put(303, "How are you");
		map.put(null, "Hello");
		map.put(303, "Hi");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	public static void main(String[] args) {
		new MapExm().m();
	}

}
