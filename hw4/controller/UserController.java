package hw4.controller;

import hw4.data.User;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String lastName);
}