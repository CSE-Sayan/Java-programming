import java.util.Scanner;
public class factors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,res=0;
        System.out.print("Enter number: ");
        n = input.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
                res = res + i;
            }
        }
        System.out.println(" ");
        System.out.println("The sum of the factors of "+n+" is: "+res);
    }
}
