import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
    /* 이분 탐색 start */
        // 기존 Data 입력
        int[] BinData = {6,7,4,5,3,1,2};
        
        Arrays.sort(BinData);
        for(int i=0;i<BinData.length; i++){
            System.out.print(BinData[i] + " ");
        }
    
            System.out.println();
        // 찾을 데이터 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("Search Data: ");
        int search = sc.nextInt();
        // 찾았으면 true else false
        boolean flag = false;
        // 찾은 위치 저장
        int index = -1;
        // 이진 탐색 저장 변수 low mid high
        int low = 0;
        int mid = 0;
        int high = BinData.length-1;
        
        while(low <= high){
        // 중간 값 찾음
            mid = (low+high)/2;
        // 찾았음 표시, 값의 위치 저장, 원하는 값 찾으면 종료
            if(BinData[mid] == search){
                flag = true;
                index = mid;
                break;
            }else{ 
        // 원하는 결과값이 없으면 범위를 줄임
                if(BinData[mid] < search){
                  low = mid +1; 
                }else{
                 high = mid +1;;
                }
            }
        // 출력
        }

        if(flag){
            System.out.println(search + "를 " + (index+1) + " found!");
        }else{
            System.out.println("Not Found! ");
        }
    }
    /* 이분 탐색 end */ 
    
}
