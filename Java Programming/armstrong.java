import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, digit, sum = 0, temp, count =0;
        System.out.print("Enter no: ");
        n = input.nextInt();
        temp = n;
        while(n>0){
            count++;
            n = n/10;
        }
        n = temp;
        while(n>0){
            digit = n%10;
            int t = 1;
            for(int i = 0; i<count; i++){
                t = t*digit;
            }
            sum += t;            
            n = n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is armstrong number");
        }
        else{
            System.out.println(temp+" is not an armstrong number");
        }
    }
}
