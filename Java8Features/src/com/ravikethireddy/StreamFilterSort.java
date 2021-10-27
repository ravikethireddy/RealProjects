package com.ravikethireddy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterSort {

	private static final List<DataSet> CHARACTERS = Collections.unmodifiableList(Arrays.asList(
            new DataSet("A", 1, 2, 3, 4, 5),
            new DataSet("B", 2, 3, 4, 5),
            new DataSet("C", 1, 2, 3),
            new DataSet("D", 3, 4),
            new DataSet("E", 3, 4, 5),
            new DataSet("F", 5),
            new DataSet("G", 2),
            new DataSet("H", 1, 2),
            new DataSet("I", 1, 2, 3)
    ));

    public static void main(final String ... args) {
        final List<String> docks = CHARACTERS.stream()
                        .filter(c -> c.data.contains(2))
                        .sorted((a, b) -> a.data.size() - b.data.size())
                        .map(c -> c.name)
                        .collect(Collectors.toList());

        System.out.println(docks);
    }

}
