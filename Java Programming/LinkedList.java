import java.util.Scanner;

class LinkedListEx{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        public void insertAtStart(int val){
        list.addFirst(val);
        System.out.print("Element inserted !!");
    
}
    }    
public void insertAtEnd(int val){
    list.addLast(val);
    System.out.println("Element inserted !!");
}
public void insertAtMiddle(int index, int val){
    list.add(index, val);
    System.out.println("Element inserted !!");
}
public void show(){
    System.out.print("Linked List = ");
    Iterator itr = list.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+" ");
    }
    System.out.println();
}
}
public class LinkedList{
    public static void main(string args[]){
        Scanner input = new Scanner(System.in);
        int choice;
        LinkedListEx obj = new LinkedListEx();
        while(true){
            System.out.println("1. INSERT AT START");
            System.out.println("2. INSERT AT END");
            System.out.println("3. INSERT AT MIDDLE");
            System.out.println("4. SHOW");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice==1){
                System.out.println("Enter element: ");
                int val = input.nextInt();
                obj.insertAtStart(val);
            }
            else if(choice==2){
                System.out.println("Enter element: ");
                int val = input.nextInt();
                obj.insertAtEnd(val);
            }
            else if(choice == 3){
                System.out.println("Enter index: ");
                int index = input.nextInt();
                System.out.println("Enter element: ");
                int val = input.nextInt();
                obj.insertAtMiddle(index,val);

            }
            else if(choice == 4){
                obj.show();
            }
            else if(choice == 0)
            break;
        }    
    }
}


 




