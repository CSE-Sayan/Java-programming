import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int max1 = arr[0], max2 = arr[0], max3 = arr[0];
        for(int i=0;i<n;i++){
            if(max1<arr[i]){
                max1 = arr[i];
            }
        }
        for(int i = 0;i<n;i++){
            if(max2<arr[i] && arr[i]!=max1){
                max2 = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max3<arr[i] && arr[i]!=max1 && max1!=max2){
                max3 = arr[i];
            }
        }

        System.out.println("First max = "+max1);
        System.out.println("Second max = "+max2);
        System.out.println("Third max = "+max3);
    }
}
