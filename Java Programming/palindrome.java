import java.util.Scanner;

public class palindrome{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, digit, rev = 0, temp;
        System.out.print("Enter no: ");
        n = input.nextInt();
        temp = n;
        while(n>0){
            digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if(rev==temp){
            System.out.println(temp+" is a palindrome number");
        }
        else{
            System.out.println(temp+" is a palindrome number");
        }
        
    }
}
