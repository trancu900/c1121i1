package vn.codegym.c1121i1.interfacee;

import java.util.List;

public class Store {
    public String name;
    public IItem item;
    public Store(IItem item){
        this.item=item;
    }

    public void setItem(IItem item) {
        this.item = item;
    }
}
