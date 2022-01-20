package get10i;

import java.util.Arrays;
import java.util.Scanner;

public class Uppercase {
	public static void main(String [] args)  {
		 int i;
		 Scanner in = new Scanner(System.in);  
	     System.out.print("Enter i value: ");  
	     i = in.nextInt(); 
	     String[] array =  new String[i]; 
	     
	     for(int j=0;j<i;j++) { 
	    	 Scanner ik = new Scanner(System.in);
		     array[j] = ik.nextLine();
		     }
	     int len=array.length;
	     
	     for(int k=0;k<len;k++) {
	    	 System.out.println(array[k].toUpperCase());
	    	 }
	     System.out.println(Arrays.toString(array));
	     }
	     }
	     
	   
	     
	

