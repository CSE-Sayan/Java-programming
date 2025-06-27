import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =0;i<n; i++){
            Scanner input1 = new Scanner(System.in);
            list1.add(input.nextLine());
        }
        Iterator itr = list1.iterator();
        System.out.print("ArrayList=> ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
    
}
