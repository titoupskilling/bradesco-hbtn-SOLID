import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");

        FileHandler fileHandler;

        fileHandler = new FileHandler("logs.txt");

        logger.addHandler(fileHandler);

        SimpleFormatter simpleFormatter = new SimpleFormatter();

        fileHandler.setFormatter(simpleFormatter);

        Logger.info("teste de Log");

        Logger.info("Olá, eu sou o teste da classe principal");

    }

}