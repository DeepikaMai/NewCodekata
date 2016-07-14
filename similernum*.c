#include<stdio.h>
int main()
{
char a[100];
int i,len;
scanf("%s",a);
len=strlen(a);
for(i=0;i<len;i++)
{
printf("%c",a[i]);
if(a[i]==a[i+1])
printf("*");
}
return 0;
}
