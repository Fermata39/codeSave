import java.util.*;

public class insertSort{
	public static void main(String[] args){

		int[] arry = {4,5,1,2,3};
		insertSort(arry);

	}

	public static void insertSort(int[] ary){
		for(int i=1; i<ary.length; i++){
			int key = ary[i]; // 기준 값 setting
			for(int j=i-1; j>=0; j--){
				if(ary[j] > key){ // 기준 값과 scan 요소 대상 비교시 key 값이 작으면
					int temp = ary[j]; // key 값을 스위칭
					ary[j] = key;
					ary[j+1] = temp;
				}
			}
		}

		System.out.println("res:" + Arrays.toString(ary));
	}
}
