import java.util.*;

public class insertSort{
	public static void main(String[] args){

		int[] arry = {4,5,1,2,3};
		insertSort(arry);

	}

	public static void insertSort(int[] ary){
		for(int i=1; i<ary.length; i++){
			int key = ary[i];
			for(int j=i-1; j>=0; j--){
				if(ary[j] > key){
					int temp = ary[j];
					ary[j] = key;
					ary[j+1] = temp;
				}
			}
		}

		System.out.println("res:" + Arrays.toString(ary));
	}
}
