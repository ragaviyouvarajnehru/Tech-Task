import java.io.*;
import java.util.*;
public class StringPalindrome 
{
public static void main(String args[])
{
String myString = "raju";
StringBuffer buffer = new StringBuffer(myString);
buffer.reverse();
String data = buffer.toString();
if(myString.equals(data)){
System.out.println("Given String is palindrome");
}
else
{
System.out.println("Given String is not palindrome");
}
}
}
