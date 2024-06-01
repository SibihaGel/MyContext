package quoters;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;


public class PropertyFileApplicationContext extends GenericApplicationContext {


    public PropertyFileApplicationContext(String fileName) {
        // Регистрируем наш класс в Definition reader
       PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
       // считаем количесво зарегистрированных бинов
       int countBeans = reader.loadBeanDefinitions(fileName);
        System.out.println("Found : " + countBeans + " beans ");
        refresh();
    }

    public static void main(String[] args) {
        // Создаем контекст в параметрах он принмает файл context.properties
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuoter();
        context.getBean(User.class).sayHello();

    }
}
