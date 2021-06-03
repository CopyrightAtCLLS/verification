package springBuffer.normalbean;

import org.springframework.stereotype.Component;

@Component
public class C {
    public C() {
        System.out.println("---------- C的构造函数 ----------");
    }

    public void print() {
        System.out.println("---------- print C ----------");
    }
}
