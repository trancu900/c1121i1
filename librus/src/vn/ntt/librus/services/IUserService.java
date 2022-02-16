package vn.ntt.librus.services;

import vn.ntt.librus.model.User;

import java.util.List;

public interface IUserService {
    User getById(long id);

    List<User> getUsers();

    void add(User newUser);

    boolean existById(long id);

}
