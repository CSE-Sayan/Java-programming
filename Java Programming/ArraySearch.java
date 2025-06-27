import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int n,i,j;
        int found = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int nums[] = new int[n];
        for(i=0;i<n;i++)
        nums[i]= input.nextInt();
        int S = input.nextInt();
        int sum;
        for(i=0;i<n;i++){
            sum = nums[i];
            found = 1;
            for(j=i+1;j<n;j++){
                sum += nums[j];
                if(sum == S){
                    System.out.println((i+1)+" "+(j+1));
                }
                else if(sum>S)
                break;
               
            }
        }
        if(found == 1)
        System.out.println(-1);
    }
}
