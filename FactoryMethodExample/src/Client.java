public class Client {
    public static void main(String args[]){
        PhoneFactory s22Factory = new GalaxyS22Factory();
        PhoneFactory s23Factory = new GalaxyS23Factory();

        Phone s22 = s22Factory.createPhone();
        Phone s23 = s23Factory.createPhone();

        s22.info();
        s23.info();
    }
}