import java.util.Scanner;

public class primeAddSub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, min_val=Integer.MAX_VALUE, max_val=Integer.MIN_VALUE;
        boolean flag;
        start = input.nextInt();
        int temp = start;
        while(temp<=end){
            flag = true;
            for(int i=2;i<temp;i++){
                if(temp%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                min_val = temp;
                break;
            }
            temp += 1;
        }
        temp = end;
        while(temp>=start){
            flag = true;
            for(int i=2;i<temp;i++){
                if(temp%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                max_val = temp;
                break;
            }
            temp -= 1;
        }
        System.out.println(min_val+max_val);
        System.out.println(max_val-min_val);
    }
}
