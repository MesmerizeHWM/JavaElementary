package org.java.elementary;

import java.util.ArrayList;
import java.util.List;

public class TestList extends ArrayList implements List {

    @Override
    public boolean add(Object o) {
        if (contains(o)) {
            System.out.println("TestList already contains " + o);
            return false;
        }
        return super.add(o);
    }

    @Override
    public void add(int index, Object element) {
        if (contains(element)) {
            System.out.println("TestList already contains " + element);
            return;
        }
        super.add(index, element);
    }

}

