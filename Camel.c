#include<stdio.h>
#include<conio.h>
void main()
{
int a1,no,i,j,su=0;
clrscr();
printf("\n Enter the number of students in the kidsgarden:");
scanf("%d",&a1);
no=2*a1;
for(i=0;i<no;i++)
{
for(j=i+1;j<=no;j++)
 {
 printf("\n%d\t%d\t\n",i,j);
 su++;
 }  }
 printf("the daily walk combination no pair is same  is %d",su);
 getch();
}
