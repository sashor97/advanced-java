import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        String item1="Apples";
        String item2="Oranges";
        String item3="Pears";
        String [] shopping={"Bread","Milk","Eggs","Bananas"};
        printShoppingList(item1,item2,item3);
        printShoppingList("Bread","Milk","Eggs","Bananas");
    }

    private static void printShoppingList(String... items) {
        Arrays.stream(items).forEach(System.out::println);
    }



}
