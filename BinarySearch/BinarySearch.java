import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		int[] data = {4,5,1,2,3};
		System.out.println("result: " + binSearch(data,3));
	}

	public static int binSearch(int[] data, int target){
		if(data == null){
			return -1;
		}
		return binSearchRec(data,0,data.length-1,target);
	}

	public static int binSearchRec(int[] data,int low,int high,int target){
		if(low > high || low < 0 || high >= data.length){
			return -1;
		}

		int mid = (low + high) /2;

		if(data[mid] == target){
			return data[mid];
		}else if(data[mid] < high){
			return binSearchRec(data,mid+1, high, target);
		}else{
			return binSearchRec(data, low, mid-1, target);
		}
	}
}
