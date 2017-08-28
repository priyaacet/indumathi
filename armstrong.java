import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int sum=0;temp,a,b;
Scanner a=new Scanner(System.in);
b=a.nextInt();
b=temp;
while(temp>0)
{
a=temp%10;
temp=temp/10'
sum=sum+a*a*a;
}
System.out.println("armstrong"+sum);
}
}

