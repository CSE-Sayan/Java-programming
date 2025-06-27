import java.util.*;

public class array2 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int nums[] = new int[n];
        for(i=0;i<n;i++)
        nums[i] = input.nextInt();
        int count = 0;
        Arrays.sort(nums);
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                int temp = nums[i] + nums[j];
                int result = Arrays.binarySearch(nums,temp);
                if(result>0){
                    count += 1;
                    System.out.println(nums[i]+" "+nums[j]+" "+temp);
                }
            }

        }
        System.out.println(count);
    }
}
