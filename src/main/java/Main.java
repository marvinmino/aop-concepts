import services.LoggingService;
import config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try{
            ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
            LoggingService service = context.getBean(LoggingService.class);
            service.printMessage("Please Insert your age: ");
            service.scanForAge();
        }
        catch(Exception e){

        }
    }
}
