#include<stdio.h>
#include<conio.h>
void main()
{
 int arr[100],size,i,j,x,y,temp,b;
 clrscr();
  printf("Enter the size of array : ");
  scanf("%d",&size);
  printf("Enter the array elements : ");
   for(i=0;i<size;i++)
   {
   scanf("%d",&arr[i]);
   }
   b=size/2;
    for(i=0;i<b;i++) {
     for(j=i+1;j<size;j++) {
      if(arr[j]<arr[i])
       {
        temp=arr[i];
        arr[j]=arr[i];
        arr[j]=temp;
      }
    }
    for(x=b;x<size;x++) {
     for(y=x+1;y<size;y++) {
      if(arr[x]<arr[y])
       {
        temp=arr[x];
        arr[y]=arr[x];
        arr[y]=temp;
        }
    }
    }
    for(i=0;i<size;i++)
    {
    printf("%d\n",arr[i]);
    }
    getch();
  }
