#include<stdio.h>
#define length 7


void sequential_sort(int ary[]){
	int i,j,c;

	for(i=0;i<length;i++){
		printf("before: %d\n", ary[i]);
		for(j=i+1; j<length; j++){
			if(ary[i] > ary[j]){
				int temp = ary[i];
				ary[i] = ary[j];
				ary[j] = temp;
			}
		}
	}

	printf("\n"); 
	for(i =0 ;i <length;i++){
		printf("after ary: %d\n",ary[i]); 
	}
}

int main(){

	int ary[] = {4,5,3,1,2,8,9};
	sequential_sort(ary);

	return 0;
}


