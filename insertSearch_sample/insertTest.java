public class InsertTest{
	public static void main(String[] args){
		int num[] = {3,5,4,1,2};
		int j=0;
		for(int i=1;i<num.length; i++){
			int key = num[i];
			for(j=i-1;j>=0;j--){
				if(num[j] < key){
					num[j+1] = key;				
				}else{
					break;
				}				
			}
			
		}		
	}
}

