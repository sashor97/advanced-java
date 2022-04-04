import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> phonebook=new LinkedHashMap(4,0.75f,false);
        phonebook.put("Sasho",12345);
        phonebook.put("Sasho2",12346);
        phonebook.put("Sasho3",123467);
        phonebook.put("Sasho4",123468);

        System.out.println("Sasho`s phone "+ phonebook.get("Sasho"));

        for(Map.Entry<String,Integer> entry:phonebook.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
