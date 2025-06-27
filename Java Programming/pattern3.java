import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,rows;
        System.out.println("Pattern 3");
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        for(i=0;i<rows;i++){
            for(j=0;j<rows;j++){
                if(i==0 || i==rows-1 || j==0 || j==rows-1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
}
}