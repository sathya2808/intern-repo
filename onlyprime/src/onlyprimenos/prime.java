package onlyprimenos;

public class prime {
	 public static void main (String[] args) {
		 for (int i=2;i<20;i++) {
			 if (i%i==0 && i%1==i) {
				 System.out.println("prime"+i);
			 }
		 }
	 }
}
