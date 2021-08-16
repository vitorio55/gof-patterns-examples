package com.learning.gofpatterns.structural.bridge.using_interface.implementation;

public interface VideogameConsole {
    void turnOn();
    void turnOff();
    void connectToInternet();
    void startGame();

    void calculateUpResult();
    void calculateDownResult();
    void calculateLeftResult();
    void calculateRightResult();

    void calculateFirstActionButtonResult();
    void calculateSecondActionButtonResult();
    void calculateThirdActionButtonResult();
    void calculateFourthActionButtonResult();
}
