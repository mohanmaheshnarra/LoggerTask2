package epam.loggerAndExceptiontask2;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App 
{   public static void main(String[] args) {
	Services standardServices = new Services("standard", 1200);
    Services aboveStandardServices = new Services("abovestandard", 1200);
    Services highStandardServices = new Services("highstandard", 1200);
    Services highAutomatedServices = new Services("highstandard", 1200, true);
    Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    logger.log(Level.INFO, "Cost using standard material: " + standardServices.getConstructionCost());
    logger.log(Level.INFO, "Cost using above standard material: " + aboveStandardServices.getConstructionCost());
    logger.log(Level.INFO, "Cost using high standard material: " + highStandardServices.getConstructionCost());
    logger.log(Level.INFO, "Cost using high standard material with automation: " + highAutomatedServices.getConstructionCost());
    }
    
}