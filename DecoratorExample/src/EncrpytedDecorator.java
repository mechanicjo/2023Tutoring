

public class EncrpytedDecorator extends Decorator{
    public EncrpytedDecorator(Message message){
        super(message);
    }

    private String encrypt(String content){
        return "encypted(" + content + ")";
    }

    @Override
    public String getContent(){
        return encrypt(super.getContent());
    }

}
