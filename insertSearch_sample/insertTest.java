import java.util.Arrays;

public class insertTest{
	public static void main(String[] args){
		int num[] = {3,5,4,1,2,7,6};
		int j=0;
		for(int i=1;i<num.length; i++){
			int key = num[i];
			for(j=i-1;j>=0;j--){
				if(num[j] > key){
					num[j+1] = num[j];
				}else{
					break;
				}
			}
			num[j+1] = key;
		}
		
		System.out.println(Arrays.toString(num));
	}
}

