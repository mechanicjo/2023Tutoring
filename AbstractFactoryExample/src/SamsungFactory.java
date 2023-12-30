

public class SamsungFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new GalaxyS23();
    }

    @Override
    public Tablet createTablet() {
        return new GalaxyTab();
    }

    @Override
    public Laptop createLaptop() {
        return new GalaxyBook();
    }

}
