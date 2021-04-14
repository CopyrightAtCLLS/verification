package serializable.immune2change;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
//        serialize();
        User user = deserialize();
        System.out.println(user);
    }

    private static void serialize() throws IOException {
        User clls = new User();
        clls.name = "clls";
        clls.age = 17;
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("temp"));
        stream.writeObject(clls);
        stream.close();
    }

    private static User deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("temp")));
        User user = (User) stream.readObject();
        stream.close();
        return user;
    }
}
