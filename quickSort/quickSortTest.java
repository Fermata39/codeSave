import java.util.*;

public class quickSortTest{
  public static void main(String[] args){
    int[] arr = {5,3,1,2,4};
    int left =0;
    int right = arr.length-1;

    arr = quickSort(arr,left,right);
    System.out.println("Q sort1: " +Arrays.toString(arr));

    arr = quickSort2(arr,left,right);
    System.out.println("Q sort2: " +Arrays.toString(arr));
  }

  public static int[] exchange(int[] arr, int l, int r){
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    return arr;
  }

  public static int[] quickSort2(int[] arr, int left, int right){

    int pivot = arr[(left+right)/2];
    int l = left;
    int r = right;

    while(l<=r){ // 배열 arr 을 scan
      while(arr[l] < pivot) // 배열에 left 에 있는 element 가 pivot 보다 작으면
        l++; // left 쪽 주소 값을 증가

      while(arr[r] > pivot) // 배열에 right 에 있는 element 가 pivot 보다 크면
        r--; // right 쪽 주소 값을 감소

      // 만약 left / right 의 element 가 pivot 값 보다 크거나 작을 경우

      if(l<=r){
        arr = exchange(arr, l, r); // 해당 주소에 있는 값을 교환
        l++; // 현재 주소는 다음 주소로 이동 (left 니까 증가)
        r--; // 현재 주소는 다음 주소로 이동 (right 니까 감소)
      }
    }

    if(l < right){ // 변경된 left 주소(l) 에서 right 까지
      quickSort2(arr,l,right); // 정렬 되었는지 재귀 함수 호출 (왼쪽 정렬)
    }

    if(left < r){ // 변경된 right 주소(r) 까지
      quickSort2(arr,left,r); // 정렬 되었는지 재귀 함수 호출 (오른쪽 정렬)
    }

    return arr;
  }

  public static int[] quickSort(int[] arr, int left, int right){
    int index = partition(arr,left,right);

    if(left < index-1){
      quickSort(arr, left,index-1);
    }

    if(index < right){
      quickSort(arr,index, right);
    }

    return arr;
  }

  public static int partition(int[] arr, int left, int right){
    int i = left, j = right;
    int tmp;

    int pivot = arr[(left+right)/2];

    while(i<=j){
      while(arr[i] < pivot){
        i++;
      }
      while(arr[j] > pivot){
        j--;
      }

      if(i<=j){
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++;
        j--;
      }
    }
    return i;
  }
}
