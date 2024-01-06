

public class Decorator implements Message{
    protected Message message;

    public Decorator(Message message){
        this.message = message;
    }

    @Override
    public String getContent(){
        return message.getContent();
    }
}
