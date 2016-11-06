public class quickTest{
  public static void main(String[] args){
    System.out.println("test");

    int[] arr = {3,4,1,2,5,6,7};

    int left =0;
    int right = arr.length-1;

    quickSort(arr,left,right);

    for(int data : arr){
      System.out.println("After QuickSort: " + data);
    }

  }

  public static void quickSort(int[] data, int l , int r){
    System.out.println("Enter quickSort");

    int pivot = data[(l+r)/2];
    System.out.println("pivot: " + pivot);

    int left = l;
    int right = r;

    while(left<right){
      while(data[left] < pivot){
          left++;
      }
      while(data[right] > pivot){
          right--;
      }

      int temp;

      if(left <= right){
        temp = data[left];
        data[left] = data[right];
        data[right] = temp;
        left++;
        right--;
      }
    }

    if(left < r){
      quickSort(data,left,r);
    }

    if(l < right){
      quickSort(data,l,right);
    }
  }
}
