import java.util.Scanner;
public class greatest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.print("Enter first no: ");
        n1 = input.nextInt();
        System.out.print("Enter second no: ");
        n2 = input.nextInt();
        System.out.print("Enter third no: ");
        n3 = input.nextInt();
        System.out.print("Enter fourth no: ");
        n4 = input.nextInt();
        if( n1>n2 && n1>n3 && n1>n4){
            System.out.println("The greatest number is: "+n1);
        
        }
        else if( n2>n1 && n2>n3 && n2>n4) {
            System.out.println("The greatest number is: "+n2);
        }
        else if( n3>n1 && n3>n2 && n3>n4){
            System.out.println("The greatest number is: "+n3);
        }
        else{
            System.out.println("The greatest number is: "+n4);
        }
        
    }
    
}
