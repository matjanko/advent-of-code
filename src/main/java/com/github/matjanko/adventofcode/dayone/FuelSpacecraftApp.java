package com.github.matjanko.adventofcode.dayone;


import java.util.List;

/**
 * @author matjanko
 *
 */
public class FuelSpacecraftApp {

    public static void main(String[] args) {

        FuelSpacecraftService service = new FuelSpacecraftService();
        List<Integer> massData = service.getMassData();

        System.out.println("-----------MASS DATA----------");
        massData.forEach(System.out::println);

        System.out.println("-----------PART ONE SOLUTION----------");
        System.out.println(service.sumFuels(massData));

        System.out.println();
        System.out.println("-----------PART TWO SOLUTION----------");
        System.out.println(service.sumAllRequiredFuels(massData));
    }
}
