

public class Client {
    public static void main(String[] args){
        Service proxyService = new ProxyService( new RealService());
        proxyService.execute();
    }
}