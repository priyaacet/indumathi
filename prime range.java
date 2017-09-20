import java.io.*;
import java.util.*;
class primerange
{
public static void main(String args[])
{
int n1=1,n2=10;
int flag=0,i,j;
System.out.println("enter the prime number for given range");
for(i=n1;i<=n2;i++)
{
for(j=n1;j<i,j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}
}
if(flag==1)
{
System.out.println(i);
}
}
}
}

