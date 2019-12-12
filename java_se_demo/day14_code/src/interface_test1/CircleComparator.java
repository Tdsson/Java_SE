package com.tdsson.interface_test1;

import java.util.Comparator;
//Comparator的实现类CircleComparator，可以比较两个圆对象的大小，比较半径
public class CircleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Circle c1 = (Circle)o1;
        Circle c2 = (Circle)o2;

        if (c1.getRadius()> c2.getRadius()) {
            return 1;
        }else if (c1.getRadius()< c2.getRadius()) {
            return -1;
        }else {
            return 0;
        }
    }
}
