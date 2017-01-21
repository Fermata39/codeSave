#include<stdlib.h>
#include<string.h>
#include<stdio.h>

int main(){

	/* temp fix -START */
	int iNumDualApnPlmn = 8;
	int isDualApnSim = 0;
	int i,j;
	char g_aDualApnPlmnList[8][6];
	char temp_dualApnPlmnList[8][6] = {"26201", "21901", "23203", "22603", "22606", 
		"20201", "23001", "45000"};
	char compareChar[] = "22606";

	for (i = 0; i < 8; i++) {
		if (strcmp(compareChar, temp_dualApnPlmnList[i]) == 0) {
			isDualApnSim = 1;
			printf("sungwoo, IA: temporary dualApnSim=%s\n", temp_dualApnPlmnList[i]);
		}
	}
	strncpy(g_aDualApnPlmnList[i], temp_dualApnPlmnList[i], strlen(temp_dualApnPlmnList[i]));

	return 0;
}
