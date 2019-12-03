package com.github.matjanko.adventofcode.daythree;

import java.util.*;

/**
 * @author matjanko
 *
 */
public class CrossedWiresService {

    // TODO need refactor - too slow
    public Set<Field> findIntersection(List<Field> fieldsOne, List<Field> fieldsTwo) {
        Set<Field> intersections = new HashSet<>();

        for (Field fieldOne : fieldsOne) {
            for (Field fieldTwo : fieldsTwo) {
                if (fieldTwo.equals(fieldOne)) {
                    intersections.add(fieldTwo);
                }
            }
        }

        return intersections;
    }

    public List<Field> setARoute(String[] data) {
        List<Field> result = new LinkedList<>();
        int x = 0, y = 0;

        for (String value : data) {
            int move = Integer.parseInt(value.substring(1));
            if (value.startsWith("R")) {
                for (int j = 1; j <= move; j++) {
                    result.add(new Field(++x, y));
                }
            } else if (value.startsWith("L")) {
                for (int j = 1; j <= move; j++) {
                    result.add(new Field(--x, y));
                }
            } else if (value.startsWith("U")) {
                for (int j = 1; j <= move; j++) {
                    result.add(new Field(x, ++y));
                }
            } else if (value.startsWith("D")) {
                for (int j = 1; j <= move; j++) {
                    result.add(new Field(x, --y));
                }
            }
        }

        return result;
    }

    public int calculateMinDistance(Set<Field> intersections) {
        List<Integer> result = new LinkedList<>();
        for (Field field : intersections) {
            result.add(Math.abs(field.getX()) + Math.abs(field.getY()));
        }
        return Collections.min(result);
    }
}
