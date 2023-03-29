import java.io.*;
import java.util.*;
class num
{
public static void main(String args[])
{
int m,n,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the m value:");
m=s.nextInt();
for(i=1;i<=m;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.print("* ");
}
}
}
