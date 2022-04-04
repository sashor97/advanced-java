public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        GreetingMessage greetingMessage=new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+name);
            }
        };
        greetingMessage.greet("Sasho");
        GreetingMessage greetingMessage1=(String name)->{
            System.out.println("Hello "+name);
        };
        greetingMessage1.greet("Saso");
        Square s=new Square(4);

        Shapes shapes=Square::calculateArea;
        System.out.println("Area: "+shapes.getArea(s));
    }
}
