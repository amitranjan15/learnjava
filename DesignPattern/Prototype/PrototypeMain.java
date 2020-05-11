
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user=new User();
        user.setId(1);
        user.setName("amit");

        User user2=user.clone();
        user2.setName("amit2");
        System.out.println(user);
        System.out.println(user2);
    }
}