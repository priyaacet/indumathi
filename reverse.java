import java.io.*;
import java.util.*;
public class first
{
public static void main(String args[])
{
int a=123,ans=0;
while(a!=0);
{
int rem=a%10;
ans=ans*10+rem;
a=a/10;
}
System.out.println("the reverse value is"+ans);
}
}
