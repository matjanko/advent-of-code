package com.github.matjanko.adventofcode.daytwo;

/**
 * @author matjanko
 *
 */

public class ProgramAlarmService {

    public int[] doIntcodeProgram(int[] code) {
        for (int i = 0; i < code.length; ++i) {
            if(code[i] == 99) {
                break;
            } else if (code[i] == 1) {
                code[code[i+3]] = code[code[i+1]] + code[code[i+2]];
                i += 3;
            } else if (code[i] == 2) {
                code[code[i+3]] = code[code[i+1]] * code[code[i+2]];
                i += 3;
            }
        }
        return code;
    }

    public int[] prepareIntcodeProgram(int[] code) {
        code[1] = 12;
        code[2] = 2;
        return code;
    }

    public int getResult(int[] code) {
        return code[0];
    }
}
