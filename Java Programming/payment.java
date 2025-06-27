import java.util.Scanner;
public class payment {
    public static void main(String  args[]){
        Scanner input = new Scanner(System.in);
        int payment, days;
        float interest, si;
        System.out.print("Enter payment: ");
        payment = input.nextInt();
        System.out.print("Enter no of days: ");
        days = input.nextInt();
        System.out.print("Enter rate of interest: ");
        interest = input.nextFloat();
        si = (payment * days * interest )/100;
        System.out.println("Simple interest is: "+si);
    }
}    