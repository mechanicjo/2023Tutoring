

public class OperatingSystem {
    private static String type = "MAC";
    public static void main(String[] args){
        LoggerFactory loggerFactory = new LoggerFactory();
        adder(loggerFactory);
        multiplier(loggerFactory);
    }

    private static void adder(LoggerFactory loggerFactory){
        String loggerType = "File";
        String message = "log from adder";

        Logger logger = loggerFactory.createLogger(loggerType);
        logger.error(message);
    }

    private static void multiplier(LoggerFactory loggerFactory){
        String loggerType = "Android";
        String message = "log from multiplier";

        Logger logger = loggerFactory.createLogger(loggerType);
        logger.error(message);

    }
}