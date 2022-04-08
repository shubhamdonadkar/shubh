package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayliststudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> in=new ArrayList<>();

	in.add(1);
	in.add(2);
	in.add(3);
	in.add(4);
	in.add(5);
	System.out.println(in);
	System.out.println(in.contains(41));
	System.out.println(in.isEmpty());
	in.add(0, 10);
	in.remove(0);
	
	System.out.println("=======================using for loop=================================");
	for(int i=0;i<in.size();i++) {
		System.out.println(in.get(i));
	}
	System.out.println("=======================using iterator loop=================================");
	Iterator<Integer> it=in.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("=======================using for each loop=================================");
	for(Integer s:in ) {
		System.out.println(s);
	}
	
	}

}
