package com.ravikethireddy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

class DataSet {
    public final String name;
    public final Set<Integer> data;
    public DataSet(final String name, final Integer ... seasons) {
        this.name = name;
        this.data = Collections.unmodifiableSet(new TreeSet<>(Arrays.asList(seasons)));
    }
}
