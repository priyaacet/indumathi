import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int c=0,temp,a;
  int n=123;
  temp=n;
  while(n>0)
  {
    a=n%10;
    n=n/10;
    c=c+(a*a*a);
  }
  if(temp==c)
  {
    System.out.println("armstrong");
  }
  else
  {
    System.out.println("not armstrong ");
  }
}
}
