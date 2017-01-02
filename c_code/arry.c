#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main(){

    char singleA[] = "1111";
    char dubbleA[4][5] = {"aaa","1111","444"};
    int  i =0;

    for(i=0; i<3; i++){
        if(strcmp(singleA,dubbleA[i])==0){
            printf("find equal: %s\n", dubbleA[i]);
        }
        printf("print:%s\n",dubbleA[i]);
    }
}
