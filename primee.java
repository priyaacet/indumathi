import java.io.*;
import java.util.*;
import java.net.*;
class A
{
public static void main(String args[])
{
int i,b;
int n;
Scanner a=new Scanner(System.in);
b=a.nextInt();
n=b/2;
for(i=2;i<=n;i++)
{
if(b%i==0)
{
System.out.println("not prime");
}
else
{
System.out.println("prime");
}
}
}
}
