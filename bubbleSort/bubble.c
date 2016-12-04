#include<stdio.h>
#define max 7

void bubble(int data[]){
	int i,j;

	for(i=max;i>0;i--){
		for(j=1; j<i; j++){
			if(data[j-1] > data[j]){
				int temp = data[j-1];
				data[j-1] = data[j];
				data[j] = temp;
			}
		}
	}


	for(i=0;i<max;i++){
		printf("after: %d\n",data[i]);	
	}
}

int main(){
	int ary[] = {5,4,3,1,6,2,7};

	bubble(ary);
	return 0;
}

