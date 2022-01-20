package function;
import java.util.Scanner; 

public class addition {
	public static void main(String [] args)  {
	int s;
	Scanner scan=new Scanner(System.in);  
	System.out.print("Enter the number: ");
	s=scan.nextInt(); 
	if(s%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	add(1,2);
	}
	// which is greater a or b
	public String add(int a,int b) {
		if(a>b) {
			return "a is greater "+a;
		}
		else {
			return "b is greater"+b;
		}}
	}
