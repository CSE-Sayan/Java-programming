import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int arr[][] = new int[n][];
        for(i=0;i<n;i++){
            int n1 = input.nextInt();
            arr[i] = new int[n1];
            for(j=0;j<n1;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(i=0;i<n;i++){
            System.out.print("i=>");
            for(j=0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
