package com.github.matjanko.adventofcode.dayfour;


/**
 * @author matjanko
 *
 */

public class SecureContainerApp {

    public static void main(String[] args) {

        SecureContainerService service = new SecureContainerService();
        int startInput = 353096;
        int endInput = 843212;

        System.out.println(service.getDifferentPasswordCount(startInput, endInput));
    }
}
