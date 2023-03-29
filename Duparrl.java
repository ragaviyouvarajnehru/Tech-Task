import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Duparrl 
{
public static void main(String[] args) 
{
List<String> aList1 = new ArrayList<String>();
aList1.add("raju");
aList1.add("ragavi");
aList1.add("loki");
aList1.add("loki");
aList1.add("ragavi");
System.out.println("The ArrayList items are:" );
for (String i : aList1)
System.out.println(i);
HashSet<String> h = new HashSet<String>(aList1);
List<String> aList2 = new ArrayList<String>(h);
System.out.println("The ArrayList items after removing duplicates are:" );
for (String i : aList2)
System.out.println(i);
}
}
