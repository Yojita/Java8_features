package com.yojita.practice.java8.optional;

import java.util.Arrays;
import java.util.List;

public class UserRepository {

    private final List<User> users = Arrays.asList(new User("1", "Yojita"), new User("2", "Devashish"));

    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
