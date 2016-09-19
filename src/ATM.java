import java.util.HashMap;
import java.util.Scanner;

import static java.lang.String.*;

/**
 * Created by Troy on 9/19/16.
 */
public class ATM {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        HashMap<String,User> users = new HashMap<>();
        User user = new User("Alice","help",100.0);
        users.put("Alice",user);
        //Creating and Entering Username and Password
        while (true) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            User user1 = users.get(name);
            if (user1 == null) {
                System.out.println("Username created");
                user1 = new User(name, "mypassword", 100.0);
                users.put(name,user1);
                System.out.println("Enter password");
            }
            else {
                System.out.println("Enter password");
            }


            String typedInPassword = scanner.nextLine();

            if (users.containsKey(name)) {
                if ((user.password).equals(typedInPassword)) {
                    System.out.println("Welcome, " + name);
                } else {
                    System.out.println("Invalid password. Create new password or try again");
                    String newPassword = scanner.nextLine();
                    User user2 = new User(name, typedInPassword, 100.0);
                    users.put(name, user1);
                }
            }

        }
    }
}
