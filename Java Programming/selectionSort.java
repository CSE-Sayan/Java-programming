import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int nums[] = new int[n];
        for(i=0;i<n;i++)
        nums[i]= input.nextInt();
        for(i=0;i<n;i++){
            int index= i;
            for(j=i+1;j<n;j++){
                if(nums[j]<nums[index]){
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
       for(i=0;i<n;i++)
       System.out.println(nums[i]+ " "); 
    }
}
