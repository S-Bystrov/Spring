import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogBean {
    @Bean(name ="dog")
    public Dog dog(){
        return new Dog();
    }
}
