package numbers;

import java.util.Scanner;

public class odd_even {
 public static void main(String[] args) {
	 int i;
	 Scanner in = new Scanner(System.in);  
     System.out.print("Enter i value: ");  
     i = in.nextInt();  
     System.out.println("Number is:"+i);            
     in.close();       
	 if (i%2==0) {
		 System.out.println("even");}
	 else {
		 System.out.println("odd");
			 
		 }
	 }
 }

 