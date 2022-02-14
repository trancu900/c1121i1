package vn.ntt.librus.model;

public class User {
    private long id;
    private String fullName;
    private String phone;
    private String email;
    private Role role;


    public User(String raw) {
        String[] strings = raw.split(",");
        this.id = Integer.parseInt(strings[0]);
        this.fullName = strings[1];
        this.phone = strings[2];
        this.email = strings[3];
        this.role = Role.parseRole(strings[4]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + "," + fullName + "," + phone + "," + "," + email + "," + role.getValue();
    }


}
