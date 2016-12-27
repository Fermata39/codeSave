#include<stdio.h>
#include<string.h>

int main(){

    char *key1="123456789";
    char *key2="10111213";
    char merge[256];
    char *test = malloc(sizeof(char)*256);
//    memset(key1,0,10);
//    memset(key2,0,1yyp0);

    sprintf(merge,"%s%s",key1,key2);
    
    char *temp = malloc(sizeof(char)*92);
    char *temp2 = malloc(sizeof(char)*92);

    strcpy(temp,key1);
    strcpy(temp2,key2);

    strcat(temp,temp2);

    printf("string!: %s\n",temp);
    
    

    return 0;
}
