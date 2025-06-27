import java.util.Scanner;
public class sumOfNumbers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int no,i,res=0;
        System.out.print("Enter the number: ");
        no = input.nextInt();
        for(i=0;i<=no;i++){
            res = res + i;
        }
        System.out.println("Sum from 0 to "+no+" is: "+res);
    }
    
}
