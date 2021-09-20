package com.learning.gofpatterns.behavioral.memento;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.behavioral.memento.mementos.Memento;

import java.util.ArrayList;
import java.util.List;

public class MementoExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printMementoBanner();

        System.out.println("==> Running Memento Example");

        System.out.println("""
            The Memento Pattern implements a way of saving state of an entity without exposing the implementation
            details of such entity

            Here the Memento Patter is divided into 3 specific implementations:
            Since our entity has a text field and 2 integer attributes, we create mementos for saving those fields
            Theres a text only Memento, an integer attributes Memento and a whole-entity Memento
            We make changes to the entity (the Originator) and save them to specific Mementos that will rollback only
            the fields that they are meant to revert
            """);

        List<Memento> states = new ArrayList<>();

        ConcreteOriginator originator = new ConcreteOriginator("Old text", 1, 3);
        System.out.println("* Created initial Originator entity:");
        originator.print();

        states.add(originator.saveTextState());
        System.out.println("\n* Saved Originator initial state (text only)");

        states.add(originator.saveValuesState());
        System.out.println("* Saved Originator initial state (values only)");

        states.add(originator.saveWholeState());
        System.out.println("* Saved Originator initial state (whole state)");

        originator.setText("New text");
        System.out.println("\n* Changed Originator's text to: 'New text'");
        originator.print();

        originator.setValA(3);
        originator.setValB(4);
        System.out.println("\n* Changed integer attributes to 3 and 4");
        originator.print();

        states.remove(0).restore();
        System.out.println("\n* Reverted Originator to initial state (text only)");
        originator.print();

        originator.setText("New text");
        System.out.println("\n* Changed Originator's text to: 'New text'");
        originator.print();

        states.remove(0).restore();
        System.out.println("\n* Reverted Originator to initial state (values only)");
        originator.print();

        originator.setValA(5);
        originator.setValB(6);
        System.out.println("\n* Changed integer attributes to 5 and 6");
        originator.print();

        states.remove(0).restore();
        System.out.println("\n* Reverted Originator to initial state (whole state)");
        originator.print();

        System.out.println();
    }

}