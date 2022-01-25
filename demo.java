
import java.util.Scanner;
public class demo {
    public static void main(String[] args){
        createarr q=new createarr();
        System.out.println("1:to create array n check emmy or not n gives u len");
        System.out.println("2:which is greater");
        System.out.println("3:subtration");
        System.out.println("4:get array value one by one");
        System.out.print("enter the option  ");
        Scanner i=new Scanner(System.in);
        int n =i.nextInt();
        switch(n){
            case 1:
            q.create();
            break;
            case 2:
            q.greater();
            break;
            case 3:
            q.sub(11,11);
            break;
            case 4:
            q.getarr();
           // System.out.println(arr);
            break;
            default:
            System.out.println("no option");
            
        }
    
        
        
        }
       
}
