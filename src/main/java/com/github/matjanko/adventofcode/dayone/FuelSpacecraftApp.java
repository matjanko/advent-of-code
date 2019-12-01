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

        System.out.println("-----------REQUIRED FUELS----------");
        System.out.println(service.sumRequiredFuels(massData));
    }
}
