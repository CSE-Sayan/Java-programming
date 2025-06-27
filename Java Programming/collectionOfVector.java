import java.util.*;

public class collectionOfVector {
    public static void main(String args[]) {
        Vector<String> list1 = new Vector<String>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =0;i<n; i++){
            Scanner input1 = new Scanner(System.in);
            list1.add(input.nextLine());
        }
        Iterator itr = list1.iterator();
        System.out.print("Vector=> ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
    
}
