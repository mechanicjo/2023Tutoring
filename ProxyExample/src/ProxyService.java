

public class ProxyService  implements Service{
    private RealService realService;
    public ProxyService(RealService realService){
        this.realService = realService;
    }

    @Override
    public void execute(){
        System.out.println("Execution start");
        realService.execute();
        System.out.println("Execution end");
    }
}
