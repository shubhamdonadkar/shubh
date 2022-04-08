package collection;

import java.util.ArrayList;

public class Arp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add(null);
		list.add(0,null);
		list.add(0,null);
		list.add(0,null);
		list.add(1,null);
		System.out.println(list);
		System.out.println("==================================================================");
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(null);
		in.add(0, 20);
		in.add(1, null);
		in.add(2, 58);
		in.add(0, 2);
		in.add(null);
		System.out.println(in);
		System.out.println("==================================================================");
		ArrayList all=new ArrayList<>();
		all.add(20);
		all.add(0, "shubh");
		all.add(1, "sankya");
		all.add(0, 112.23);
		all.add(0, 'a');
		all.add(all);
		all.add(all);
		all.addAll(all);
		System.out.println(all);
		System.out.println("==================================================================");
		
	}

}
