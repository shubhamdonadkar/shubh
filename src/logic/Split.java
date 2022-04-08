package logic;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suman,yashvant,bulle";
		String sep=",";
		String[]splited=s.split(sep);
		//System.out.println("shubham");
		for(int i=0;i<splited.length;i++) {
			System.out.println(splited[i]);
		}
	}

}
