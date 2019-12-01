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
    public void shouldReturn(int mass, int expectedFuel) {
        // when
        int actualFuel = fuelSpacecraftService.getFuels(mass);

        // then
        Assert.assertEquals(expectedFuel, actualFuel);
    }

}
