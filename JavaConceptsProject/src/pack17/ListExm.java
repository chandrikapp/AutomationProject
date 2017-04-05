package pack17;

import java.util.*;

public class ListExm {
	
	public void m(){
		
		List<String> studentsList=new ArrayList<String>();
		studentsList.add("govardhan");
		studentsList.add("shiva");
		studentsList.add("sowjanya");
		studentsList.add("shahanaj");
		studentsList.add("chandrika");
		studentsList.add("shiva");
		studentsList.add(null);
		for(String s:studentsList){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ListExm l=new ListExm();
		l.m();
	}

}
