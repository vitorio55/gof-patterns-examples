package com.learning.gofpatterns.behavioral.mediator.entities;

import com.learning.gofpatterns.behavioral.mediator.enums.CalculatorOperation;
import com.learning.gofpatterns.behavioral.mediator.enums.EventType;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public class CalculatorUIMediator implements Mediator {
    private final CopyOnWriteArrayList<Consumer<EventType>> observers = new CopyOnWriteArrayList<>();
    private CalculatorOperation operation;
    private Integer firstOperator;
    private Integer secondOperator;

    public CalculatorUIMediator() {
        this.firstOperator = null;
        this.secondOperator = null;
        this.operation = CalculatorOperation.NONE;
    }

    public void setOperator(Integer operator) {
        if (this.firstOperator == null) {
            this.firstOperator = operator;
        } else if (this.secondOperator == null) {
            this.secondOperator = operator;
        } else {
            this.triggerEvent(EventType.CLEAR);
            this.firstOperator = operator;
        }
    }

    @Override
    public void addObserver(EventType eventType, Runnable observer) {
        observers.add(et -> {
            if (et == eventType) {
                observer.run();
            }
        });
    }

    @Override
    public void notifyObservers(EventType eventType) {
        observers.forEach(observer -> observer.accept(eventType));
    }

    @Override
    public void triggerEvent(EventType eventType) {
        notifyObservers(eventType);
        switch (eventType) {
            case CLEAR -> {
                this.firstOperator = null;
                this.secondOperator = null;
                this.operation = CalculatorOperation.NONE;
            }
            case SHOW_DISPLAY -> this.printDisplayContents();
            case SET_ADD_OPERATION -> this.operation = CalculatorOperation.ADD;
            case SET_SUB_OPERATION -> this.operation = CalculatorOperation.SUBTRACT;
            case SET_NUM_0, SET_NUM_1, SET_NUM_2, SET_NUM_3, SET_NUM_4,
                 SET_NUM_5, SET_NUM_6, SET_NUM_7, SET_NUM_8, SET_NUM_9 -> this.setOperator(eventType.ordinal());
            case EXECUTE_OPERATION -> this.executeOperation();
        }
    }

    private void printDisplayContents() {
        String contents = String.format("%s %s %s",
            this.firstOperator == null ? "" : this.firstOperator,
            this.operation == CalculatorOperation.NONE ? "" : this.getOperationSymbol(),
            this.secondOperator == null ? "" : this.secondOperator)
            .trim();
        System.out.printf("Calculator display contents: (%s)\n", contents);
    }

    private String getOperationSymbol() {
        if (this.operation == CalculatorOperation.NONE)
            return "";
        return this.operation == CalculatorOperation.ADD ? "+" : "-";
    }

    private void executeOperation() {
        if (this.operation == CalculatorOperation.ADD) {
            this.firstOperator += this.secondOperator;
        } else {
            this.firstOperator -= this.secondOperator;
        }
        this.secondOperator = null;
        this.operation = CalculatorOperation.NONE;
    }
}
