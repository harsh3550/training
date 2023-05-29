package springDay4;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMain4 {
    public static void main(String[] args) {
        Logger log = LogManager.getLogger(TestMain4.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("springDay4Beans.xml");
        Calculator calculator = (Calculator) context.getBean("calculatorBean");
        log.info(String.valueOf(calculator.add(3, 5)));
        log.info(String.valueOf(calculator.add(23989.88,764876.34)));
        log.info((Calculator.add("Hello","World")));
        log.info(String.valueOf(calculator.subtract(53,20)));
        log.info(String.valueOf(calculator.subtract(7676.76,2345.34)));
        log.info(String.valueOf((calculator.multiply(5,2))));
        log.info(String.valueOf(calculator.multiply(5.2,5.4)));
        log.info(String.valueOf(calculator.divide(5,2)));
        log.info(String.valueOf(calculator.divide(45.23,20.23)));
    }
}