import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myList=new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");
        myList.remove("B");
        System.out.println(myList);

    }
}
