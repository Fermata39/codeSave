#include<stdio.h>

typedef struct
{
	char bit:2;// char 8bit 중 2bit 만 사용하겠다는 뜻(bit 필드 구조체)
}BIT;



int main(){
  	char ch = 200;
	//char ch2 = 3;
	BIT b;
	b.bit = 3;
 	printf("%d\n", ch);
	//printf("%d\n", ch2);
	printf("%d\n", b.bit);

	return 0;
}



