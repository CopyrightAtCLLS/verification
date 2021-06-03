package springBuffer.Bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class B {
    public B() {
        System.out.println("---------- B的构造函数 ----------");
    }

    public B(A a) {
        this.a = a;
    }

    @Resource
    private A a;

    public void print() {
        System.out.println("---------- print B ----------");
    }
}
