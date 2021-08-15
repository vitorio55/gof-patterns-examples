package com.learning.gofpatterns.creational.singleton;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

public class SingletonExample implements Example {
    @Override
    public void runExample() {
        BannerPrinter.printSingletonBanner();

        System.out.println("==> Running Singleton Example");

        System.out.println("This is the first usage of Singleton's getInstance()");
        Singleton singleton = Singleton.getInstance();
        System.out.print(singleton + "\n\n");

        String val = "1234";
        System.out.printf("Setting Singleton's value to (%s)\n\n", val);
        singleton.setValue(val);

        System.out.print("Result:\n" + singleton + "\n\n");

        val = "5678";
        System.out.printf("Setting another Singleton's reference value to (%s)\n", val);
        Singleton anotherSingleton = Singleton.getInstance();
        anotherSingleton.setValue(val);
        System.out.println("");

        System.out.println("This is the new reference to a Singleton...");
        System.out.println(anotherSingleton + "\n");

        System.out.println("This is the reference to a Singleton used at the beginning...");
        System.out.println(singleton + "\n");

        System.out.println("As we can see, actually there isn't a reference to another Singleton, they all reference the same instance.\n");
    }
}
