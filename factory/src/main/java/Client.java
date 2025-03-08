public class Client {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreatorA();

        Product product = creator.create();
        product.operation();

        creator = new ConcreteCreatorB();

        product = creator.create();
        product.operation();

    }

}