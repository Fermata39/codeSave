#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
    int i;
    /* temp fix -START */
    int g_iNumDualApnPlmn = 8;
    char operatorNumeric[] = "22603";
    char temp_dualApnPlmnList[8][6] = {"26201", "21901", "23203", "22603", "22606", "20201", "23001", "45000"};
    char g_aDualApnPlmnList[8][6];

    for (i = 0; i < 8; i++) {
        printf("org_print: %s\n", temp_dualApnPlmnList[i]);
        printf("compare_str: %s\n",operatorNumeric);
        if (strcmp(operatorNumeric,temp_dualApnPlmnList[i]) == 0) {
           int isDualApnSim = 1;
           printf("find_dualApnPlmnList=%s\n", temp_dualApnPlmnList[i]);
        }
        strcpy(g_aDualApnPlmnList[i], temp_dualApnPlmnList[i]);       
        printf("strcpy_value: %s\n" , g_aDualApnPlmnList[i]);
    }
    /* temp fix -END */ 

    return 0;

}
