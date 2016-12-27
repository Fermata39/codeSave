#include<stdio.h>
#ifndef IWLAN

int main(){

    printf("normal\n");
#ifndef IWLAN
    printf("test\n");
#else 
    printf("test1\n");
#endif
    
    return 0;
}
