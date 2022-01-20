package studentmarks;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		int Social;
		int English;
		int Maths;
		int Rollno;
		String name;
		int total;
	 Scanner i1 = new Scanner(System.in);  
     System.out.print("Enter the rolno: ");  
     Rollno = i1.nextInt();
     Scanner i2 = new Scanner(System.in);  
     System.out.print("Enter the name ");  
     name = i2.nextLine();
     Scanner i3 = new Scanner(System.in);  
     System.out.print("Maths: ");  
     Maths = i3.nextInt();
     Scanner i4 = new Scanner(System.in);  
     System.out.print("English: ");  
     English= i4.nextInt();
     Scanner i5 = new Scanner(System.in);  
     System.out.print("Social: ");  
     Social= i5.nextInt();
     total=Maths+Social+English;
     float per=(total*100)/300;
     System.out.print("you name is"+name +"ur percentage is:" +per);
}}
