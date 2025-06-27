import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,rows;
        System.out.println("Pattern 4");
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        for(i=0;i<rows;i++){
            for(j=0;j<rows;j++){
                if(i==0 || i==rows-1 || j==0 || j==rows-1 || i==j || j==1 || i==rows-2){
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
