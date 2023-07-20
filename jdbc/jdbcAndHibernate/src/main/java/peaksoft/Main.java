package peaksoft;

import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Baktulan","Nazirbek", (byte) 21);
//        userService.removeUserById(2L);
//        userService.dropUsersTable();
//        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
    }
}
