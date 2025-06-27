import java.util.Scanner;

public class reverse{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, digit, rev = 0, sum = 0;
        System.out.print("Enter no: ");
        n = input.nextInt();
        while(n!=0){
            digit = n%10;
            rev = rev*10+digit;
            sum = sum+digit;
            n = n/10;
        }
        System.out.println("Reverse is: "+rev);
        System.out.println("Sum of digit is: "+sum);
        
    }
}