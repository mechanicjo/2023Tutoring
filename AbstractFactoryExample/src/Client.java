

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Factory factory;
        String company = "Apple";

        if(company.equals("Apple")){
            factory = new AppleFactory();
        } else {
            factory = new SamsungFactory();
        }

        Phone phone = factory.createPhone();
        Tablet tablet = factory.createTablet();
        Laptop laptop = factory.createLaptop();

        phone.call();
        tablet.touch();
        laptop.typing();
    }
}