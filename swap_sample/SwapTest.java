import java.util.*;

public class SwapTest {
	public static void main(String[] args){
		
		int a[] = new int[10];
		callSwap(4,10,a);

		//System.out.println("swap: " , a.toString);
	}

	public static void callSwap(int i,int k,int[] a){
		// i = 4 , k = 10
		
		// a[i] == 6
		a[i] = a[k] - a[i];
		// a[k] == 4
		a[k] = a[k] - a[i];
		
		a[i] = a[k] + a[i];

		System.out.println("a[k]:" + a[k] + "a[i]: "+a[i]);
	}
}
