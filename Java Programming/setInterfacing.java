import java.util.*;
public class setInterfacing {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        int n = input.nextInt();
        System.out.print("Enter set elements: ");
        for(int i=0; i<n;i++){
            set.add(input.nextInt());
        }
        System.out.print("LinkedHashSet: ");
        for(Integer val:set){
            System.out.print(val+" ");
        }
        System.out.println();
    }

}
