

public class RealService implements Service{
    public void execute(){
        for(int i = 0; i < 10; i++){
            System.out.println(i * i);
        }
    }
}
