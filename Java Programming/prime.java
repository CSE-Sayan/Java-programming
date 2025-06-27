import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        boolean flag = true;
        System.out.print("Enter no: ");
        n = input.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+"is not a prime number");
        }
    }
}