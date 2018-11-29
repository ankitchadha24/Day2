import java.util.ArrayList;
public class Day2{
	public static void main (String[]args){

		int x = (int)(Math.random()*9999)+1;

		recreateInt(x)
	}

		public static int recreateInt(ArrayList<Integer> X){
			String O = "";

			for(int i = 0; i < X.size; i++){
				O += X.get(i);
			}

			return Integer.valueOf(O);

	}
}
