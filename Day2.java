import java.util.ArrayList;
public class Day2{

	public static ArrayList<Integer> convertToArrayList(int num){
		ArrayList<Integer> list = new ArrayList<>();
		while(num!=0){
			list.add(0,num%10);
			num/=10;
			}
		return list;


	}
	public static int recreateInt(ArrayList<Integer> p){
			String O = "";

			for(int i = 0; i < p.size(); i++){
				O += p.get(i);
			}

			return Integer.valueOf(O);

	}
	public static void main (String[]args){
		int x = (int)(Math.random()*9999)+1;
		System.out.println("The number is " +x);
		System.out.println("The First Method:");
		System.out.println(convertToArrayList(x));
		System.out.println("The Second Method:");
		System.out.println(recreateInt(convertToArrayList(x)));
}
}
