package vn.codegym.c1121i1.oop.nested.clazz;

public class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public User(String name, String city, String district, String street) {
        this.name = name;
        this.address = new Address(city, district, street);
    }


    @Override
    public String toString() {
         class Test {
            private String city;
            private String district;
            private String street;

            public Test(String city, String district, String street) {
                this.city = city;
                this.district = district;
                this.street = street;
            }

            @Override
            public String toString() {
                return "Address{" +
                        "city='" + city + '\'' +
                        ", district='" + district + '\'' +
                        ", street='" + street + '\'' +
                        '}';
            }
        }

        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                '}';
    }
    public static class Address {
        private String city;
        private String district;
        private String street;

        public Address(String city, String district, String street) {
            this.city = city;
            this.district = district;
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", district='" + district + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }

}
