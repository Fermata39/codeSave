#include<stdio.h>
#include<stdlib.h>

typedef struct _node
{
	int data;
	struct _node *next;
}NODE;

NODE *head;

void insert_data(NODE *head, int data){
	NODE *temp;
	temp = malloc(sizeof(NODE));
	temp->data = data;
	temp->next = head->next;
	head->next = temp;

	/*temp->next = head->next;
	head->next = temp;*/
}

void display(NODE *head, NODE *tail){
	NODE *temp;
	system("clear");
	printf("<head>");

	printf("head->data: %d head->next: %d\n",head->data,head->next);
	printf("tail: %d ",tail);
	for(temp = head ; temp != tail ; temp=temp->next){
		printf("->[%d]", temp->data);
	}
	printf("\n");
	getchar();
}

int main(){
	NODE tail;
	NODE head = {0,&tail};

	//printf("head: %d", &head.data);
	int i =0;
	for(i=0; i<7; i++){
		insert_data(&head, i+1);
		display(&head, &tail);
	}
	return 0;
}
