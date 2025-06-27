import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter length of array: ");
        n = input.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter array values: ");
        for(int i=0;i<n;i++)
        arr[i]=input.nextInt();
        for(int i=0;i<n;i++)
        arr[i]+=5;
        System.out.print("Array values: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
