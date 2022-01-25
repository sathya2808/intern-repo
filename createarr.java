import java.util.Arrays;
import java.util.Scanner;

class createarr {
    public void create(){
        Scanner n =new Scanner(System.in);
        int i=n.nextInt();
        String[] arr = new String[i];
        System.out.println("length of array  " +arr.length);
        System.out.println(Arrays.toString(arr));
       
    } 
    public void greater() {
        Scanner j=new Scanner(System.in);
        int a=j.nextInt();
        System.out.print("ente a value:");
        int b=j.nextInt();
        System.out.print("enter b value");
        if(a>b) {
            System.out.println("a is greater  "+a);
        }
        else {
            System.out.println("b is greater the number is  "+b);
        }}
    public void sub(int a,int b){
        System.out.println("value a-b is  " + (a-b));

    }
    public void getarr(){
        int z;
        System.out.println("enter array length:");
        Scanner in=new Scanner(System.in);
        z=in.nextInt();
        int[] arr =  new int[z]; 
	     
	     for(int j=0;j<z;j++) { 
             System.out.print("enter array value:");
	    	 Scanner ik = new Scanner(System.in);
		     arr[j] = ik.nextInt();
		     }
             System.out.println(Arrays.toString(arr));

        
    }    
    

    
//  public static void main(String[] args) {
//     createarr q=new createarr();
//     System.out.println("1:to create array n check emmy or not n gives u len");
//     System.out.println("2:which is greater");
//     System.out.println("3:subtration");
//     System.out.println("4:get array value one by one");
//     System.out.print("enter the option  ");
//     Scanner i=new Scanner(System.in);
//     int n =i.nextInt();
//     switch(n){
//         case 1:
//         q.create();
//         break;
//         case 2:
//         q.greater();
//         break;
//         case 3:
//         q.sub(11,11);
//         break;
//         case 4:
//         q.getarr();
//        // System.out.println(arr);
//         break;
//         default:
//         System.out.println("no option");
        
//     }

    
    
    }
    


