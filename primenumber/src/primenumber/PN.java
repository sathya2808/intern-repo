package primenumber;

public class PN {
	/**
	 * Main method 
	 * @param args
	 */
	public static void main(String[] args) {
		// loop to iterate values
		for(int i =2;i<30;i++) {
			if(i==2 || i==3) {
				System.out.println("prime"+i);
			}else if (i%2==0 || i%3==0 ) {
				System.out.println("not prime"+i);
			}else {
				System.out.println("prime"+i);
			}
		}
	}
}