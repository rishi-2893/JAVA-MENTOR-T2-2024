import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger("LoggingExample");

    public static void main(String[] args) {
        logger.setLevel(Level.FINE);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        logger.addHandler(consoleHandler);

        logger.config("This is config level message");
        logger.fine("This is fine level");
    }
}
