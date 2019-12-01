package com.github.matjanko.adventofcode.dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author matjanko
 *
 */
public class MassData {

    public static List<Integer> getMassList() throws IOException {
        List<Integer> massList = new ArrayList<>();
        try (Scanner in = new Scanner(new FileReader("src/main/resources/tasks/day-one/mass-list.txt"))) {
            int mass;
            while (in.hasNext()) {
                mass = Integer.parseInt(in.next());
                massList.add(mass);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return massList;
    }
}
