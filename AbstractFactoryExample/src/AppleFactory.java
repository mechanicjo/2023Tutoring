

public class AppleFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new iPhone15();
    }

    @Override
    public Tablet createTablet() {
        return new iPad();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}
