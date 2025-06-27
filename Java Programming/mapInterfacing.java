import java.util.*;
public class mapInterfacing{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer,string> map = new TreeMap<Integer,string>();
        int n = input.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int key = input.nextInt();
            String val = input.next();
            map.put(key,val);

        }
        System.out.print("Hashmap=");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
        System.out.println();
    }
}
