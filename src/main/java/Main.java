import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("userC.xml");

        User user = context.getBean("user", User.class);
        user.userSay();*/
        ApplicationContext context = new AnnotationConfigApplicationContext(DogBean.class);

        Dog dog = context.getBean("dog", Dog.class);
        dog.bark();
    }
}
