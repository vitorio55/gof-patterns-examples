package com.learning.gofpatterns.behavioral.mediator;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.behavioral.mediator.entities.*;
import com.learning.gofpatterns.behavioral.mediator.entities.ui_buttons.*;
import com.learning.gofpatterns.behavioral.mediator.enums.EventType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MediatorExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printMediatorBanner();

        System.out.println("==> Running Mediator Example");

        System.out.println("""
            The Mediator Pattern aims to provide an enclosed scope in which entities interact. It is basically an
            object that handles the entities' operations and changes of state. This means that the entities are decoupled
            from one another, which provides us a certain degree of freedom on our client code.
            
            Here, our Mediator represents an UI of a basic calculator. All of its components (display and buttons) know
            the Mediator which they call whenever they need to trigger their operation.
            """);

        CalculatorUIMediator basicCalculatorUI = new CalculatorUIMediator();

        AddButton addButton = new AddButton(basicCalculatorUI);
        SubtractButton subtractButton = new SubtractButton(basicCalculatorUI);
        EqualsButton equalsButton = new EqualsButton(basicCalculatorUI);
        ClearButton clearButton = new ClearButton(basicCalculatorUI);

        List<NumberButton> numberButtons = new ArrayList<>();

        Arrays.stream(EventType.values())
            .filter(e -> e.ordinal() < 9) // Here we only want events related to number buttons
            .collect(Collectors.toList())
            .forEach(e -> numberButtons.add(new NumberButton(basicCalculatorUI, e)));

        CalculatorDisplayScreen calculatorDisplayScreen = new CalculatorDisplayScreen(basicCalculatorUI);
        this.registerObservers(basicCalculatorUI);

        numberButtons.get(2).push();
        calculatorDisplayScreen.showScreenContents();
        addButton.push();
        calculatorDisplayScreen.showScreenContents();
        numberButtons.get(5).push();
        calculatorDisplayScreen.showScreenContents();
        equalsButton.push();
        calculatorDisplayScreen.showScreenContents();
        clearButton.push();
        System.out.println();

        numberButtons.get(1).push();
        calculatorDisplayScreen.showScreenContents();
        subtractButton.push();
        calculatorDisplayScreen.showScreenContents();
        numberButtons.get(7).push();
        calculatorDisplayScreen.showScreenContents();
        equalsButton.push();
        calculatorDisplayScreen.showScreenContents();
        clearButton.push();
        System.out.println();
    }

    public void registerObservers(CalculatorUIMediator mediator) {
        Arrays.stream(EventType.values())
            .filter(e -> e.ordinal() < 9) // Here we only want events related to number buttons
            .collect(Collectors.toList())
            .forEach(e -> mediator.addObserver(e, () -> System.out.println(">> Assigning number " + e.ordinal() + " to an operator.")));

        mediator.addObserver(EventType.SET_ADD_OPERATION, () -> System.out.println(">> Setting ADD operation."));
        mediator.addObserver(EventType.SET_SUB_OPERATION, () -> System.out.println(">> Setting SUBTRACT operation."));
        mediator.addObserver(EventType.EXECUTE_OPERATION, () -> System.out.println(">> Executed mathematical operation."));
        mediator.addObserver(EventType.CLEAR,             () -> System.out.println(">> Calculator values cleared."));
    }
}