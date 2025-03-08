public class ConcreteCreatorA extends Creator {

    @Override
    protected ConcreteProductA factoryMethod() {
        return new ConcreteProductA();
    }

}