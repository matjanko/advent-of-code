package com.github.matjanko.adventofcode.dayone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author matjanko
 *
 */
public class FuelSpacecraftService {

    public List<Integer> getMassData() {
        List<Integer> masses = new ArrayList<>();
        try {
            masses = MassData.getMassList();
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się znaleźć pliku z danymi.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawne dane");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return masses;
    }

    public int getFuels(int mass) {
        return (int)Math.floor(mass / 3f) - 2;
    }

    public int getAllRequiredFuels(int mass) {
        int fuels = getFuels(mass);//2
        int fuelsMass = 0;
        int requiredFuels = 0;
        boolean hasNeedFuels = true;

        while (hasNeedFuels) {
            requiredFuels += fuels;
            fuelsMass = fuels;
            fuels = getFuels(fuelsMass);
            if(fuels < 0) {
                hasNeedFuels = false;
            }
        }
        return requiredFuels;
    }

    public int sumFuels(List<Integer> massList) {
        int sum = 0;
        int fuels;

        for(Integer mass : massList) {
            fuels = getFuels(mass);
            sum += fuels;
        }

        return sum;
    }

    public int sumAllRequiredFuels(List<Integer> massList) {
        int sum = 0;
        int fuels;

        for(Integer mass : massList) {
            fuels = getAllRequiredFuels(mass);
            sum += fuels;
        }

        return sum;
    }
}
