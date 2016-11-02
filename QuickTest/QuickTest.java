public class QuickTest{

  public static void main(String args[]){

    int[] arry = {4,3,1,2,6,5,7};
    int left = 0;
    int right =arry.length-1;

    System.out.println("Test QuickTest");
    quickSort(arry,left,right);

    for(int data : arry){
      System.out.println("after: " + data);
    }
  }

  public static void quickSort(int[] arr,int l, int r){
      if(arr == null){
        return;
      }

      int middle = (l+r) /2;
      System.out.println("middle: " + middle);
      int pivot = arr[middle];
      System.out.println("pivot: " + pivot);

      int left = l;
      int right = r;

      while(left <= right){
        while(arr[left] < pivot)
          left++;

        while(arr[right] > pivot)
          right--;

          if(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
          }
      }

      if(l<right){
        quickSort(arr,l,right);
      }

      if(r>left){
        quickSort(arr,left,r);
      }

  }
}
