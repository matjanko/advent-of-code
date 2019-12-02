package com.github.matjanko.adventofcode.daytwo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author matjanko
 */

@RunWith(Parameterized.class)
public class ProgramAlarmServiceTest {

    private ProgramAlarmService service = new ProgramAlarmService();

    int[] input;
    int[] expectedOutput;

    public ProgramAlarmServiceTest(int[] input, int[] expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters(name = "input{0} - output{1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new int[][][]{
                {{1, 0, 0, 0, 99}, {2, 0, 0, 0, 99}},
                {{2, 3, 0, 3, 99}, {2, 3, 0, 6, 99}},
                {{2, 4, 4, 5, 99, 0}, {2, 4, 4, 5, 99, 9801}},
                {{1, 1, 1, 4, 99, 5, 6, 0, 99}, {30, 1, 1, 4, 2, 5, 6, 0, 99}},
        });
    }

    @Test
    public void doIntcodeProgramTest() {
        // when
        int[] actualOutput = service.doIntcodeProgram(input);

        // then
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }
}
