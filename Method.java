import java.io.*;
import java.util.*;
public class Method 
{
public int addNumbers(int a, int b) 
{
int sum = a + b;
return sum;
}
public static void main(String[] args) 
{
int num1 = 25;
int num2 = 15;
Method obj = new Method();
int result = obj.addNumbers(num1, num2);
System.out.println("Sum is: " + result);
}
}
