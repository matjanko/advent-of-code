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
        return  (int)Math.floor(mass / 3f) - 2;
    }

    public int sumRequiredFuels(List<Integer> massList) {
        int sum = 0;
        int fuels = 0;

        for(Integer mass : massList) {
            fuels = getFuels(mass);
            sum += fuels;
        }

        return sum;
    }
}
