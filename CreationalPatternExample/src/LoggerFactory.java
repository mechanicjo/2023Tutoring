

public class LoggerFactory {

    public Logger createLogger(String type) {
        if (type.equals("Android")) {
            return new AndroidLogger();
        } else if (type.equals("File")) {
            return new FileLogger();
        } else if (type.equals("Network")) {
            return new NetworkLogger();
        } else if (type.equals("MAC")) {
            return new MACLogger();
        } else {
            return null;
        }
    }
}
