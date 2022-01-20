package birthdayage;
import java.util.Scanner;

public class age {
	 public static void main(String[] args) {
		 int age;
		 String name;
		 String a;
		 Scanner in = new Scanner(System.in);  
	     System.out.print("Enter the name and year: ");  
	     a = in.nextLine();
	     String[] part = a.split("  ");
	     //System.out.println(part[0]);
	     //System.out.println(part[1]);
	     String year=part[1];
	     name=part[0];
	     int i=Integer.parseInt(year);
	     age=2022-i;
	     System.out.println("Happy Birthday  "  +name +"!your Age is:" +age );
	     //System.out.println("your Age is:" +year) ;
	     
	     
	 }
}
//(?<=\\D)(?=\\d)