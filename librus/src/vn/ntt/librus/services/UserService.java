package vn.ntt.librus.services;

import vn.ntt.librus.model.User;
import vn.ntt.librus.utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    private static final String PATH = "data\\users.csv";

    @Override
    public User getById(long id) {
        List<User> users = getUsers();
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        List<User> newUsers = new ArrayList<>();
        List<String> records = CSVUtils.read(PATH);
        for (String record : records) {
            newUsers.add(new User(record));
        }
        return newUsers;
    }

    @Override
    public void add(User newUser) {
        List<User> users = getUsers();
        users.add(newUser);
        CSVUtils.write("", users);
    }

    @Override
    public boolean exist(long id) {
        return getById(id) != null;
    }
}
