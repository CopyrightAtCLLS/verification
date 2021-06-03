package springBuffer;

import org.aspectj.weaver.SignatureUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import springBuffer.Bean.A;
import springBuffer.Bean.B;
import springBuffer.normalbean.C;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Main.class, args);
        A a = (A) ioc.getBean("a");
        B b = (B) ioc.getBean("b");
        C c = (C) ioc.getBean("c");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a.print();
        b.print();

    }
}
