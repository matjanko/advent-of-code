package com.github.matjanko.adventofcode.daythree;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author matjanko
 */

public class CrossedWiresApp {

    public static void main(String[] args) {

        CrossedWiresService service = new CrossedWiresService();

        String[] firstData = CrossedWiresData.getFirstWireData();
        String[] secondData = CrossedWiresData.getSecondWireData();

        List<Field> crossOne = service.setARoute(firstData);
        List<Field> crossTwo = service.setARoute(secondData);

        Set<Field> intersections = service.findIntersection(crossOne, crossTwo);

        System.out.println("---------------INTERSECTIONS---------------");
        System.out.println(intersections.toString());

        System.out.println("---------------MIN DISTANCE---------------");
        System.out.println(service.calculateMinDistance(intersections));
    }
}
