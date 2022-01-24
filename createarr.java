import java.util.Arrays;
import java.util.Scanner;

class createarr {
    public void create(){
        Scanner n =new Scanner(System.in);
        int i=n.nextInt();
        String[] arr = new String[i];
        System.out.println("length of array  " +arr.length);
        System.out.println(Arrays.toString(arr));
        if (arr==null){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    } 
    public void greater(int a,int b) {
        if(a>b) {
            System.out.println("a is greater  "+a);
        }
        else {
            System.out.println("b is greater the number is  "+b);
        }}
    public void sub(int a,int b){
        System.out.println("value a-b is  " + (a-b));

    }    
    

    
 public static void main(String[] args) {
    createarr q=new createarr();
    System.out.println("1:to create array n check emmy or not n gives u len");
    System.out.println("2:which is greater");
    System.out.println("3:subtration");
    System.out.print("enter the option  ");
    Scanner i=new Scanner(System.in);
    int n =i.nextInt();
    switch(n){
        case 1:
        q.create();
        break;
        case 2:
        q.greater(1,700);
        break;
        case 3:
        q.sub(11,11);
        break;
        default:
        System.out.println("no option");
    }

    
    
    }
    
}

