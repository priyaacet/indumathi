import java.io.*;
import java.util.*;
 public class pal
{
public static void main(String args[])
{
int r,sum=0,temp;
int n;
Scanner a=new Scanner(System.in);
n=a.nextInt();
temp=n;
  while(n!=0)
  {
    r=n%10;
    sum=sum*10+r;
    n/=10;
  }
  if(temp==sum)
  
    System.out.println(temp+"is palindrome");
  
  else
  
    System.out.println(temp+"is not palindrome");
  
}
}
