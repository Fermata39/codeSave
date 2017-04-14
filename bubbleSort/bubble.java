import java.util.*;

public class bubble{
	public static void main(String[] args){
		int[] arr = {5,4,1,2,3,7,6,8,9,10};

		bubbleSort(arr);
	}

	public static int[] swap(int[] arr, int i, int j){

		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

		return arr;
	}
	public static void bubbleSort(int[] arr){

		for(int i =0 ; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					arr = swap(arr,i,j);
				}
			}
		}

		System.out.println("Bubble: " + Arrays.toString(arr));

	}

}
