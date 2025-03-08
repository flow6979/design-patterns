public class Client {

    public static void main(String args[]) {

        AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractFactory factoryB = new ConcreteFactoryB();

        AbstractProductA productA1 = factoryA.createProductA();
        AbstractProductB productB1 = factoryA.createProductB();

        AbstractProductA productA2 = factoryB.createProductA();
        AbstractProductB productB2 = factoryB.createProductB();

        productA1.show();
        productA2.show();
        productB1.show();
        productB2.show();

    }

}