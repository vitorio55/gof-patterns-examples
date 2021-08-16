package com.learning.gofpatterns.structural.bridge.using_interface.abstraction;

import com.learning.gofpatterns.structural.bridge.using_interface.implementation.VideogameConsole;

public abstract class VideogameController {
    VideogameConsole videogameConsole;

    public VideogameController(VideogameConsole videogameConsole) {
        this.videogameConsole = videogameConsole;
    }

    abstract void moveUp();
    abstract void moveDown();
    abstract void moveLeft();
    abstract void moveRight();

    abstract void pressFirstActionButton();
    abstract void pressSecondActionButton();
    abstract void pressThirdActionButton();
    abstract void pressFourthActionButton();
}
