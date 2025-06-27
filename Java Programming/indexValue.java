import java.util.Scanner;

public class indexValue {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i,n, pos, count=0, digit=0, temp;
        n = input.nextInt();
        pos = input.nextInt();
        temp = n;
        while(n>0){
            count++;
            n = n/10;
        } 
        n = temp;
        if(pos>count){
            System.out.println("-1");
        }
        else if(pos<0) {
            System.out.println("Invalid");
        }
        else{
            for(i=0;i<pos;i++){
                digit = n%10;
                n = n/10;
            }
            System.out.println(digit);
        }
    }
}
