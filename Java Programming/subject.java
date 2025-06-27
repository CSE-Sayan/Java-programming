import java.util.Scanner;
public class subject {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        float percentage;
        System.out.print("Enter marks of five subjects: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();
        percentage = (n1+n2+n3+n4+n5)/5;
        System.out.println("Percentage is: "+percentage);
    }
}
