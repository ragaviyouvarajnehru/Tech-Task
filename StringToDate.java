import java.text.SimpleDateFormat;  
import java.util.Date;  
public class StringToDate
 {  
public static void main(String[] args)throws Exception {  
    String sDate1="26/05/1999";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
}  
}  
