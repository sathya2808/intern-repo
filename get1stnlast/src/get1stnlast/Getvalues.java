package get1stnlast;

import java.util.Arrays;

public class Getvalues {
	 public static void main(String[] args) {
		 int[] a= {1,3,5,9};
		 // to get 1st n last element
		 System.out.println(a[0]);
		 System.out.println(a[a.length-1]);
		 int[] b = new int[a.length];
		 //copying a to b
		 b=a;
		 // to print array
		 System.out.println(Arrays.toString(b));
		 // to compare two array
		 int[] c = {4,7,9};
		 System.out.println(Arrays.equals(a, c));
		 System.out.println(Arrays.equals(a, b));
		 // checking whether array is empty or not
		 if(a==null) {
			 System.out.println("empty");
		 }
		 else {
			 System.out.println("not empty");}
		 
		 // to find sum n product of array
		 int sum =0;
		 int prod=1;
		 int i;
	    for (i=0;i<a.length;i++) {
	    	sum =sum +a[i];
	    	prod=prod*a[i];
	    }
	    System.out.println("sum of array is " + sum);
	    System.out.println("product of array is " + prod);
	    // to add two array
	    int[] array= new int[a.length+c.length];
	    System.out.println("length of array is" +array.length);
	    //t[] ne=new int[4];
	    int[]ist= {2,3,4,5,6};
	    // cloning ist to liss
	    int[]liss= ist.clone();
	    liss[0]=44;
	    String[]rrr={"athya","vicky","sammy"};
	    //nsole.log(rrr);
	   //rr.push("hello");
	    System.out.println(Arrays.toString(liss));
	    System.out.println(ist.length);
        for(int j=0;j<a.length;j++) {
        	if(a[j]==5) {
        		System.out.println("index no of 5 is " +j+ "present");
        		return;
        		}
        	else {
//        		 System.out.println("no value");
        		}
        	
        	for(int le=0;le<a.length;le++) {
        		int emp[le]=new int()
        	
        	System.out.println(emp);
        }}
	    
	    }
}

