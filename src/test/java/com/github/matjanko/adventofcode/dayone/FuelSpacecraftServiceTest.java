package com.github.matjanko.adventofcode.dayone;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author matjanko
 *
 */
@RunWith(JUnitParamsRunner.class)
public class FuelSpacecraftServiceTest {

    private FuelSpacecraftService fuelSpacecraftService = new FuelSpacecraftService();

    @Test
    @Parameters({
            "12, 2",
            "14, 2",
            "1969, 654",
            "100756, 33583"
    })
    public void getFuelsTest(int mass, int expectedFuels) {
        // when
        int actualFuels = fuelSpacecraftService.getFuels(mass);

        // then
        Assert.assertEquals(expectedFuels, actualFuels);
    }

    @Test
    @Parameters({
            "14, 2",
            "1969, 966",
            "100756, 50346"
    })
    public void getAllRequiredFuels(int mass, int expectedFuels) {
        // when
        int actualFuels = fuelSpacecraftService.getAllRequiredFuels(mass);

        // then
        Assert.assertEquals(expectedFuels, actualFuels);
    }
}
