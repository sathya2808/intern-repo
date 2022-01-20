package dimond;

import java.util.Scanner;

public class dimondpattern {
  public static void main(String[] args) {
	  Scanner sczn=new Scanner(System.in);
		System.out.print("enter n value:");
		int n=sczn.nextInt();		
	    for(int i=n;i>1;i--) {
		 for(int j=n-1;j<i;j++) {
			System.out.print(" ");
		 }
		 for(int j=n;j<=n;j--) {
			 System.out.print("* ");
		 }
		System.out.println();
		}
	}
  }
