#include<stdio.h>
int main()
{
int n,temp,remainder,reverse=0;
printf("enter positive number");
scanf("%d",&n);
temp=n;
while(temp>0)
{
remainder=temp%10;
reverse=reverse*10+remainder;
temp/=10;
}
printf("The reverse of %d is %d.", n, reverse);
}
