package com.learning.gofpatterns.creational.prototype.deepcopy_abstractclass;

import com.learning.gofpatterns.Example;

public class PrototypeDeepCopyAbstractClassExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Prototype Example that uses a base abstract class and Java's Cloneable interface");

        ConcretePrototype1 cp1 = new ConcretePrototype1();
        cp1.setStringOne("This is a string");
        cp1.setStringTwo("This is another string");
        cp1.setIntZero(0);
        cp1.setIntOne(1);
        cp1.setIntTwo(2);
        cp1.setFirstLevel(new FirstLevelInnerClass(new SecondLevelInnerClass("A new string"), 10));

        ConcretePrototype1 ccp1 = null;
        System.out.println("The first concrete prototype object is this:\n  " + cp1);
        System.out.println("It will now be copied...");

        try {
            ccp1 = (ConcretePrototype1)cp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        assert ccp1 != null;
        System.out.println("The copied object is this:\n  " + ccp1);

        ccp1.getFirstLevel().setNumber(99);

        System.out.println("\nChanged the copy's inner object's number to 99:\n  " + ccp1);
        System.out.println("As we can see the base (non-copy) object has not changed:\n  " + cp1);

        ConcretePrototype2 cp2 = new ConcretePrototype2();
        cp2.setSomeFloat(1099.534F);

        ConcretePrototype2 ccp2 = null;
        System.out.println("The second concrete prototype object is this:\n  " + cp2);
        System.out.println("It will now be copied...");

        try {
            ccp2 = (ConcretePrototype2)cp2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        assert ccp2 != null;
        System.out.println("The copied object is this:\n  " + ccp2);
        System.out.println("");
    }
}
