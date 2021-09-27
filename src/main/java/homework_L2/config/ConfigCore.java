package homework_L2.config;

import homework_L2.ab_package.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCore {

    @Bean
    public A a() {
        return new A();
    }
}
