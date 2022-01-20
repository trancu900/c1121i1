package vn.codegym.c1121i1.compara;

import java.util.Comparator;

public class RadiusSortASC implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.getRadius() - o2.getRadius());
    }
}
