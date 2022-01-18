package vn.codegym.c1121i1.interfacee;

public class CanCuocCD {
    private long id;
    private String name;

    public CanCuocCD(String name) {
        this.id = System.currentTimeMillis();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CanCuocCD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
