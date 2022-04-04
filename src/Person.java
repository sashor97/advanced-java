import java.util.Scanner;

public class Person {
    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String toString(){
        return name+" "+number;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int number= Integer.parseInt(scanner.next());
        Person person=new Person(name,number);
        System.out.println("Person data:"+ person.toString());

    }
}
