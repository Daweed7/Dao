package jm.task.core.jdbc;

import java.util.List;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        user1.setName("Миша");
        user2.setName("Дима");
        user3.setName("Саша");
        user4.setName("Катя");
        user1.setLastName("Козлов");
        user2.setLastName("Тен");
        user3.setLastName("Сычев");
        user4.setLastName("Долгова");
        user1.setAge((byte) 20);
        user2.setAge((byte) 15);
        user3.setAge((byte) 30);
        user4.setAge((byte) 42);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем – " + user1.getName() + " добавлен в базу данных");
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем – " + user2.getName() + " добавлен в базу данных");
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем – " + user3.getName() + " добавлен в базу данных");
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем – " + user4.getName() + " добавлен в базу данных");

        List<User> allUsers = userService.getAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
