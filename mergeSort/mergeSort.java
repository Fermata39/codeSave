public class mergeSort{
    static int[] arry = {3,4,1,2,6,5,9,7,8};

    public static void main(String[] args){

        int left = 0;
        int right = arry.length;
        int mid = arry.length/2;
        //System.out.println("mid : " + mid);

        mergeSort(left,right);
    }

    public static int[] mergeSort(int left, int right){

        if(arry.length <2){
            return arry;
        }

        if(left < right){
            
            int mid = (left + right)/2; 

            if(arry[left] > arry[mid]){
                int temp = arry[left];
                arry[left] = arry[mid];
                arry[mid] = temp;
                left++;

                mergeSort(left,mid);
            }

            if(arry[mid+1]>arry[right]){
                int temp = arry[mid+1];
                arry[mid+1] = arry[right];
                arry[right] = temp;
                right--;

                mergeSort(mid+1 , right);
            }

            merge(left,right,mid);
        }

        return arry; 
    }

    public static void merge(int left, int right,int mid){
        
        int[] temp = null;
        for(int i=left; i<=right; i++){
            temp[i] = arry[i];
        }

        int l = left;
        int r = right;
        int m = mid+1;

        while(left <= mid && mid+1 <= right){
            if(temp[l] > temp[mid]){
                int tmp = temp[mid];
                temp[mid] = temp[left];
                temp[left] = tmp;
                l++;
            }

            if(temp[r] < temp[m]){
                int tmp = temp[r];
                temp[r] = temp[m];
                temp[m] = tmp;
                r--;
            }
        }

    
    }
}
