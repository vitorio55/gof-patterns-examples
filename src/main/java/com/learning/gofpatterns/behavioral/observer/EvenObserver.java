package com.learning.gofpatterns.behavioral.observer;

public class EvenObserver implements Observer {
    String className;
    String id;

    public EvenObserver(String id) {
        this.className = this.getClass().getSimpleName();
        this.id = id;
    }

    @Override
    public void update(int num) {
        if (num % 2 == 1)
            return;
        System.out.printf("[%s %s] I just observed number (%d)!\n", this.className, this.id, num);
    }
}
