

public class CompressedDecorator  extends Decorator{
    public CompressedDecorator(Message message){
        super(message);
    }

    private String compress(String content){
        return "compressed(" + content + ")";
    }

    @Override
    public String getContent(){
        return compress(super.getContent());
    }
}
