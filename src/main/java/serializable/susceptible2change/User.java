package serializable.susceptible2change;

import java.io.*;

/**
 * 序列化后，添加成员变量
 * 再反序列化，就会抛出java.io.InvalidClassException
 *
 * 即使只是修改变量名也会导致hash变化
 */
public class User implements Serializable {
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
