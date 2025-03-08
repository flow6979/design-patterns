public class ConcreteCreatorB extends Creator {

    @Override
    protected ConcreteProductB factoryMethod() {
        return new ConcreteProductB();
    }

}