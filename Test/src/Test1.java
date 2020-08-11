import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;  

  
   
 

public class Test1 {

	public static void main(String args[]){
		
		java.util.Date date=new java.util.Date();  

		System.out.println(date);  
		
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now));*/
		/*Date date = new Date();
		long time=date.getTime();
		System.out.println("time::"+time);*/
	}
}
