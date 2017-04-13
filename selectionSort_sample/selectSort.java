import java.util.*;

public class selectSort{
	public static void main(String[] args){
		int[] ary = {5,4,1,2,3};

		callSelectionSort(ary);
	}


	public static void callSelectionSort(int[] ary){

		int min=0;

		for(int i=0; i<ary.length; i++){
			min = i;
			for(int j= i+1; j<ary.length;j++){
				if(ary[min] > ary[j]){
					min = j;
				}
			}

			int temp = ary[i];
			ary[i] = ary[min];
			ary[min] = temp;

		}

		System.out.println("res: " + Arrays.toString(ary));
	}
}
