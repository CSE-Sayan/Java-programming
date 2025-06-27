import java.util.Scanner;

public class matrixTranpose {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and column: ");
        n = input.nextInt();
        int mat[][] = new int[n][n];
        int res[][] = new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                mat[i][j] = input.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               res[i][j] = mat[j][i];
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
