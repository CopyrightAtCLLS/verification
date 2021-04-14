package serializable.immune2change;

import java.io.Serializable;

/**
 * 设置serialVersionUID可以防止成员变量变化带来的Exception
 * 因为JVM会根据JavaBean计算hash,作为serialVersionUID
 * 手动指定后，JVM就不会进行这一步操作，而是根据我们的serialVersionUID进行判断
 *
 * 同时也有效避免了，即使JavaBean没有修改，不同JVM间hash算法不同导致的java.io.InvalidClassException
 */
public class User implements Serializable {
    private static final long serialVersionUID = 2494909392538309221L;
    public String name;
    public int age;
//    public int causingException;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
