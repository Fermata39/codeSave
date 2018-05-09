#include<stdio.h>

void printUp(int arry[],int cnt);
void printDown(int arry[],int cnt);

int main(){
    int input = 0;
	int arry[19];
	int i=0;
	int cnt=0;
  
	
    while(1){
		printf("\ninput: ");
        scanf("%d",&input);

		if(cnt ==19){
			cnt = 0;
		}
		
        if(input == 0){
            printf("program is end\n");
            break;
        }

        if(0 < input && input < 11){
            
            if(input %2 ==0){
                printf("even number\n");
            }else{
				
				arry[cnt] = input;
				cnt++;
								
				printUp(arry,cnt);
				
				if(cnt > 9){
				   printDown(arry,cnt);
				}
            }				
        }else{
            printf("should input 1-10 \n");
            continue;
        }
    }
}

void printUp(int arry[],int cnt){
	int i=0;
	
	for(i=0;i<cnt;i++){				
		if(i < 5){
			printf("%d" , arry[i]);
			if(i==4){
				printf("\n");
			}
		}else if(5 <= i && i <8){
			if(i == 5){
				printf(" ");
			}						
			printf("%d" , arry[i]);
			if(i==7){
				printf("\n");
			}
		}else{
			if(i==8){
				printf("  ");
			}
			
			printf("%d" , arry[i]);
			printf("\n");
			break;
		}
	}								
}

void printDown(int arry[],int cnt){
	int i=0;
		
	for(i=0;i<cnt;i++){		
		if(i<10){
			continue;
		}
		
		if(i == 10){
			printf("  ");
			printf("%d" , arry[i-1]);
			printf("\n");
			
		}else if(10 < i && i <14){
			if(i == 11){
				printf(" ");
			}						
			printf("%d" , arry[i-1]);
			if(i==13){
				printf("\n");
			}
		}else if(13 < i && i < 19){					
			printf("%d" , arry[i-1]);
		}else{
			for(i=0;i<100;i++){
				arry[i] = 0;
			}
			break;
		}
	}								
}

