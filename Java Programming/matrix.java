import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
    int n,i,j;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns: ");
    n = input.nextInt();
    int mat1[][] = new int[n][n];
    int mat2[][] = new int[n][n];
    int res[][] = new int[n][n];
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            mat1[i][j] = input.nextInt();
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            mat2[i][j] = input.nextInt();
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j || (i+j)==n-1){
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
            else{
                res[i][j]=0;
            }
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
