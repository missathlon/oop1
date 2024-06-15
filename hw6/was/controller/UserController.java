package hw6.was.controller;

import hw6.was.data.User;

import java.time.LocalDate;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
