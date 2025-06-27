import java.util.Scanner;

public class maxMinPrimeAddSub{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, min_val= Integer.MAX_VALUE, max_val= Integer.MIN_VALUE;
        boolean flag;
        start = input.nextInt();
        end = input.nextInt();
        for(int i=start;i<=end;i++){
            flag = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
                
            }
            if(flag == true){
                min_val = Math.min(min_val,i);
                max_val = Math.max(max_val,i);
            }

            }
            System.out.println(min_val+max_val);
            System.out.println(max_val-min_val);
        }
    }

    

