public abstract class Creator {

    protected abstract Product factoryMethod();

    public Product create() {
        return this.factoryMethod();
    }
}