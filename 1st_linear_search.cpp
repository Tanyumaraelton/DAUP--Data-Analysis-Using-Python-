#include<stdio.h>
int main()
{
	int a[5],i,search,count=0;
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter search item\n");
	scanf("%d",&search);
	for(i=0;i<5;i++)
	{
		if(a[i]==search)
		{
			printf("%d element found at %d position\n",search,i+1);
			count++;
		}
	
		}
		if(count==0)
		printf("%d element not found in list",search);
		else
		printf("%d element found %d times\n",search,count);
		return 0;
}
