import java.util.*;

public class Parentheses{
	public static void main(String[] args){
		
		System.out.println("Result: " + getPairs(4));
	
	}

	public static ArrayList<String> getPairs(int n){
		if(n==0){
			System.out.println("Wrong Input");
			return null;
		}
		
		return getPairsRec(n,n,"",new ArrayList<String>());
	}

	public static ArrayList<String> getPairsRec(int left, int right, 
												String pair,
												ArrayList<String> list){
		if(left > right)
			return list;
		if(left < 0 || right < 0)
			return list;
		
		if(left == 0 && right ==0){
			list.add(pair);
			return list;
		}

		getPairsRec(left-1, right, pair+"(",list);
		getPairsRec(left, right-1, pair+")",list);


		return list;
	}

}
