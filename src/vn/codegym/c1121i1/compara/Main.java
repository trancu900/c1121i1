package vn.codegym.c1121i1.compara;

import vn.codegym.c1121i1.array.Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Circle> list = new ArrayList<>();
        list.add(new Circle(1.0));
        list.add(new Circle("Z", 10.0));
        list.add(new Circle("A", 10.0));
        list.add(new Circle(10.0));
        list.add(new Circle(10.0));
        list.add(new Circle(250.0));
        list.add(new Circle(1.9));
        list.add(new Circle(1.8));
        RadiusSortASC radiusSortASC = new RadiusSortASC();
        list.sort(radiusSortASC);
        System.out.println(list);

//        list.sort(new Comparator<Circle>() {
//            @Override
//            public int compare(Circle o1, Circle o2) {
//                return (int) (o2.getRadius() - o1.getRadius());
//            }
//        });
        list.sort(new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                double result = o2.getRadius() - o1.getRadius();
                if (result == 0) {
                    if (o2.getName() == null && o1.getName() == null)
                        return 0;
                    if (o1.getName() != null && o2.getName() != null)
                        return o2.getName().compareTo(o1.getName());
                    if (o2.getName() != null)
                        return 1;
                    else
                        return -1;
                } else {
                    if (result > 0)
                        return 1;
                    else {
                        if (result < 0)
                            return -1;
                        else
                            return 0;
                    }
                }
            }
        });
        System.out.println(list);
    }
}
