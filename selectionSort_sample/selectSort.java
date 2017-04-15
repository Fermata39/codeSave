import java.util.*;

public class selectSort{
	public static void main(String[] args){
		int[] ary = {5,4,1,2,3};

		callSelectionSort(ary);
		callSelectionSort2(ary);
	}

	public static int[] swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void callSelectionSort2(int[] arr){
		int min = 0;

		for(int i=0; i<arr.length; i++){
			min = i;
			for(int j=i+1; j<arr.length;j++){
				if(arr[min] > arr[j])
					arr = swap(arr,j,min);
			}
		}

		System.out.println("res2: " + Arrays.toString(arr));
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
