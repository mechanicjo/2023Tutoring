

public class Client {
    public static void main(String[] args){
        Message simpleMessage = new SimpleMessage("Hello");
        System.out.println(simpleMessage.getContent());

        Message encryptedMessage = new EncrpytedDecorator(new SimpleMessage("Hello"));
        System.out.println(encryptedMessage.getContent());

        Message htmlMessage = new HTMLDecorator(new SimpleMessage("Hello"));
        System.out.println(htmlMessage.getContent());

        Message encryptedAndCompressedMessage = new CompressedDecorator(new EncrpytedDecorator(new SimpleMessage("Hello")));
        System.out.println(encryptedAndCompressedMessage.getContent());
    }
}