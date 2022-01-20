package vn.codegym.c1121i1.compara;

import java.util.Comparator;

public class RadiusSortDESC implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        double result = o2.getRadius() - o1.getRadius();

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
