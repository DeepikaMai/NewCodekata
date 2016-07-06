#include<stdio.h>
#include<conio.h>
void main()
{
int n1,n,rem,sum=0;
clrscr());
printf("Enter the number :");
scanf("%d",&n);
n1=n;
while(n!=0)
{
rem=n%10;
sum+=(rem*rem*rem);
n=n/10;
}
if(n1=sum)
printf("Given number is a armstrong ");
else
printf("Given number is not a armstrong number ");
getch();
}
