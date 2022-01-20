package pyramid;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		Scanner sczn=new Scanner(System.in);
		System.out.print("enter n value:");
		int n=sczn.nextInt();		
		for(int i = 0 ; i < n; i++)
		{
			for (int j=n-1;j>i; j--)
			{
				System.out.print(" ");
			}
			 for (int j=0; j <=i ;j++) {
				 System.out.print("* ");
			 }
			System.out.println();
     	}
	}}