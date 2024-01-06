

public class HTMLDecorator extends Decorator{
    public HTMLDecorator(Message message){
        super(message);
    }

    private String header(String content){
        return "header(" + content + ")";
    }

    @Override
    public String getContent(){
        return header(super.getContent());
    }
}
