#include<stdio.h>
#include<stdlib.h>

int main(){
	printf("test\n");

    char test[4] = "100%";
    char temp[4];
    int i=0,j=0;
    char a;
    for(i=0; i<4; i++){
        printf("test[%d]: %c\n",test[i]);
        if(isdigit(test[i])){
            temp[i] = test[i];           
        }
    }

    for(j=0;j<4;j++){
        printf("temp: %c\n",temp[j]);
    }

    printf("atoi : %d\n" , atoi(temp));

	return 0;
}
