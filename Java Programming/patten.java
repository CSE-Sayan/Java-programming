import java.util.Scanner;

public class patten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,rows;
        System.out.println("Pattern 1");
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        for(i=0;i<rows;i++){
            for(j=0;j<rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        
    }
    
}
}
