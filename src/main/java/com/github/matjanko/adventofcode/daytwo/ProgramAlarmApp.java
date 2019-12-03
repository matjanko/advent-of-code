package com.github.matjanko.adventofcode.daytwo;

/**
 * @author matjanko
 *
 */

public class ProgramAlarmApp {

    public static void main(String[] args) {
        ProgramAlarmService service = new ProgramAlarmService();

        int[] intcode = service.prepareIntcodeProgram(ProgramAlarmData.getIntcode());

        System.out.println("-----------PART ONE SOLUTION----------");
        System.out.println(service.getResult(service.doIntcodeProgram(intcode)));
    }
}
