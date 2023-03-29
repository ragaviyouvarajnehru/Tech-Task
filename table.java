import java.io.*;
import java.util.*;
class table
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int a,i;
for(i=1;i<=10;i++)
{
a=n*i;
System.out.println(n+"*"+i+"="+a);
}
}
}
