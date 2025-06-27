import java.util.Scanner;

public class primeNoWithinRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, i, j, temp;
        boolean flag;
        System.out.print("Enter start point: ");
        start = input.nextInt();
        System.out.print("Enter end point: ");
        end = input.nextInt();
        for(i=start;i<=end;i++){
            temp = i;
            flag = true;
            for(j=2;j<temp;j++){
                if(temp%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(" "+i);
            }
        }

    }
}
