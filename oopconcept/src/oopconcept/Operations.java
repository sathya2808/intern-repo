package oopconcept;

import java.util.*;
import java.lang.*;



class Action  {
	
	  static int addition(int a,int b) {
		   return a+b; 
	   }
	   
	   static int sub(int a,int b) {
		   return a-b;
	   }
	
}
      public class Operations extends Action{
	  
      public void hello() {
		    
      System.out.println("hello this is subclass");
	  }
 
      

		public static void main(String[] args) {
			//Operations S1= new Operations();
			//System.out.println(S1.addition(19,1));
			System.out.println(addition(10,21));
			Operations p = new Operations();
			p.hello();
			
			
		}}
