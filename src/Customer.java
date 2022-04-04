import java.util.LinkedList;

public class Customer {
    private boolean hasBeenServed;
    private String name;
    public Customer(String name){
        hasBeenServed=false;
        this.name=name;
    }
    public void serve(){
        hasBeenServed=true;
        System.out.println(name+ " has been served");
    }
    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        LinkedList<Customer> queue=new LinkedList<>();
        queue.add(new Customer("Sasho"));
        queue.add(new Customer("Sasho2"));
        queue.add(new Customer("Sasho3"));
        queue.add(new Customer("Sasho4"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

    }
    static void serveCustomer(LinkedList<Customer> queue){
        Customer c=queue.poll();
        c.serve();
    }

}
