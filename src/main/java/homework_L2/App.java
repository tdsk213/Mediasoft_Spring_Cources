package homework_L2;


import homework_L2.ab_package.A;
import homework_L2.ab_package.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class);

        B b = new B(context.getBean(A.class));

    }
}
