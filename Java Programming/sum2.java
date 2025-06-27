import java.util.Scanner;
public class sum2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n1,n2,i,res=0;
        System.out.print("Enter start point: ");
        n1 = input.nextInt();
        System.out.print("Enter end point: ");
        n2 = input.nextInt();
        for(i=3;i<=20;i++){
            if(i%2!=0){
                res = res + i;
            }
        }
        System.out.println("Sum of odd numbers from "+n1+" to "+n2+" is: "+res);
        
    }
}
