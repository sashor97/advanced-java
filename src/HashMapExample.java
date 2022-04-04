import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> phonebook=new HashMap<>();
        phonebook.put("Sasho",12345);
        phonebook.put("Sasho2",12346);
        if(phonebook.containsKey("Sasho")){
            phonebook.remove("Sasho");
        }
        phonebook.clear();
        System.out.println(phonebook);
    }
}
