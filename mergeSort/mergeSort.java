import java.util.*;

public class mergeSort{
    static int[] arry = {3,4,1,2,6,5,9,7,8};
    static int[] temp = new int[arry.length];

    public static void main(String[] args){

        int left = 0;
        int right = arry.length;

        System.out.println("before: " + Arrays.toString(arry));
        mergeSort(left,right-1);

        System.out.println("after: " + Arrays.toString(arry));

    }

    public static void mergeSort(int left, int right){
        //arry 값이 2 보다 작을 경우 return
        if(arry.length <2){
            return;
        }

        // left 와 right 를 비교 
        if(left < right){

            int mid = (left+right)/2;

            mergeSort(left,mid);
            mergeSort(mid+1,right);

            merge(left,right);
        }
    }

    public static void merge(int left, int right) {

        //임시 int 배열 생성
        int[] temp = new int[arry.length];

        for(int i =left; i<=right; i++){
            temp[i] = arry[i];
        }

        int l=left;
        int i=left;
        int mid = (left+right)/2;
        int m = mid+1;

        while(l<=mid && m <= right){
        
            if(temp[l] <= temp[m]){
                arry[i] = temp[l];
                l++;
            }else{
                arry[i] = temp[m];
                m++;
            }
            i++;
        }

        while(l<=mid){
            arry[i] = temp[l];
            i++;
            l++;
        }

        while(m<=right){
            arry[i] = temp[m];
            m++;
            i++;
        }

    }
}
