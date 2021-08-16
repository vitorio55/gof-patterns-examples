package com.learning.gofpatterns.structural.bridge.using_interface.implementation;

public class XBox implements VideogameConsole {
    String className;

    public XBox() {
        this.className = this.getClass().getSimpleName();
    }

    @Override
    public void turnOn() {
        System.out.printf("[%s] turning ON!\n\n", this.className);
    }

    @Override
    public void turnOff() {
        System.out.printf("[%s] turning OFF!\n\n", this.className);
    }

    @Override
    public void connectToInternet() {
        System.out.printf("[%s] now connected to the internet!\n\n", this.className);
    }

    @Override
    public void startGame() {
        System.out.printf("[%s] started a game!\n\n", this.className);
    }

    @Override
    public void calculateUpResult() {
        System.out.printf("[%s] processed UP command from controller!\n\n", this.className);
    }

    @Override
    public void calculateDownResult() {
        System.out.printf("[%s] processed DOWN command from controller!\n\n", this.className);
    }

    @Override
    public void calculateLeftResult() {
        System.out.printf("[%s] processed LEFT command from controller!\n\n", this.className);
    }

    @Override
    public void calculateRightResult() {
        System.out.printf("[%s] processed RIGHT command from controller!\n\n", this.className);
    }

    @Override
    public void calculateFirstActionButtonResult() {
        System.out.printf("[%s] processed first action button command from controller!\n\n", this.className);
    }

    @Override
    public void calculateSecondActionButtonResult() {
        System.out.printf("[%s] processed second action button command from controller!\n\n", this.className);
    }

    @Override
    public void calculateThirdActionButtonResult() {
        System.out.printf("[%s] processed third action button command from controller!\n\n", this.className);
    }

    @Override
    public void calculateFourthActionButtonResult() {
        System.out.printf("[%s] processed fourth action button command from controller!\n\n", this.className);
    }
}
