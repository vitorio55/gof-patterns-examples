package com.learning.gofpatterns.structural.bridge.using_interface.abstraction;

import com.learning.gofpatterns.structural.bridge.using_interface.implementation.VideogameConsole;

public class WirelessController extends VideogameController {
    String className;

    public WirelessController(VideogameConsole videogameConsole) {
        super(videogameConsole);
        this.className = this.getClass().getSimpleName();
    }

    @Override
    public void moveUp() {
        System.out.printf("[%s] sending signal through the air to move UP!\n", this.className);
        this.videogameConsole.calculateUpResult();
    }

    @Override
    public void moveDown() {
        System.out.printf("[%s] sending signal through the air to move DOWN!\n", this.className);
        this.videogameConsole.calculateDownResult();
    }

    @Override
    public void moveLeft() {
        System.out.printf("[%s] sending signal through the air to move LEFT!\n", this.className);
        this.videogameConsole.calculateLeftResult();
    }

    @Override
    public void moveRight() {
        System.out.printf("[%s] sending signal through the air to move RIGHT!\n", this.className);
        this.videogameConsole.calculateRightResult();
    }

    @Override
    public void pressFirstActionButton() {
        System.out.printf("[%s] sending signal through the air to execute first action!\n", this.className);
        this.videogameConsole.calculateFirstActionButtonResult();
    }

    @Override
    public void pressSecondActionButton() {
        System.out.printf("[%s] sending signal through the air to execute second action!\n", this.className);
        this.videogameConsole.calculateSecondActionButtonResult();
    }

    @Override
    public void pressThirdActionButton() {
        System.out.printf("[%s] sending signal through the air to execute third action!\n", this.className);
        this.videogameConsole.calculateThirdActionButtonResult();
    }

    @Override
    public void pressFourthActionButton() {
        System.out.printf("[%s] sending signal through the air to execute fourth action!\n", this.className);
        this.videogameConsole.calculateFourthActionButtonResult();
    }
}
