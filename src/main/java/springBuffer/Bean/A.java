package springBuffer.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class A {
    public A() {
        System.out.println("---------- A的构造函数 ----------");
    }

    public A(B b) {
        this.b = b;
    }

    @Resource
    private B b;

    public void print(){
        System.out.println("---------- print A ----------");
    }
}
