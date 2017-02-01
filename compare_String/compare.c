#include<stdio.h>

int main(){

    char* key1 = "net.wo.ike_algo";
    char* key2 = "net.wo.ike_algo";

    if(strcmp(key1,key2)==0){
        printf("compare ok\n");
    }else{
        printf("not equal\n");
    }

    return 0;
}
