#include<stdio.h>

int main(){

	int flag =0;
	int i;

	flag |= 1 <<0;
	flag |= 1 <<3;

	for(i= 0; i<4; i++){
		if(flag & (1<<i))
			printf("before: %d\n",i);
	}	

	printf("-----------------\n");
	
	flag &= ~(1<<3);
	for(i= 0; i<4; i++){
		if(flag & 1<<i)
			printf("after: %d\n",i);
	}

	return 0;
}

