#include<stdio.h>

int main(){
    
    int len = 4;
    char value[]="100%";
    if(len ==0){
        
    }else{
        printf("size: %d\n", sizeof(value));
        if(value[sizeof(value)-2] == '%'){
            printf("else enter");
            value[len-1] == '\0';
        }
    }

    printf("res: %s\n",value);


    return 0;
}
