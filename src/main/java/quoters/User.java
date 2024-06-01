package quoters;

import lombok.Setter;



@Setter
public class User {
    private String name;

    public User() {
        System.out.println("User Bean created");
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
