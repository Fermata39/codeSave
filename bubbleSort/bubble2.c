#include<stdio.h>
#define max 7

void bubble(int data[]){
	int i,j;

	for(i=0;i<max;i++){
		for(j=1; j<i; j++){
			if(data[i] < data[j]){
				int temp = data[];
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

