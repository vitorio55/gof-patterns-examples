package com.learning.gofpatterns.structural.decorator;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;
import com.learning.gofpatterns.structural.decorator.decorators.InversionDecorator;
import com.learning.gofpatterns.structural.decorator.decorators.SpaceBetweenLettersDecorator;
import com.learning.gofpatterns.structural.decorator.decorators.UppercaseDecorator;

public class DecoratorExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printDecoratorBanner();

        System.out.println("==> Running Decorator Example");

        System.out.println("""
                For the Decorator Pattern demonstration, we will have a base entity that stores a text.
                Using our decorators, we can think of layers that each decorator execute their string manipulation before
                calling a lower member of the decorator stack. At the bottom of the stack, we have our simple base text
                component, which just stores the final argument text as its own.
                """);

        String text = "This is a simple text to demonstrate the functionality of the Decorator Pattern";

        BaseTextComponent component = new BaseTextComponent(text);
        System.out.print("Base component has this text:\n  ");
        System.out.println(component.getText());

        System.out.println("\nApplying our three text decorators separately, one at a time:");

        SpaceBetweenLettersDecorator spaceDecorator = new SpaceBetweenLettersDecorator(component);
        spaceDecorator.setText(component.getText());
        System.out.println("Using space decorator:\n  " + spaceDecorator.getText());
        component.setText(text);

        UppercaseDecorator uppercaseDecorator = new UppercaseDecorator(component);
        uppercaseDecorator.setText(component.getText());
        System.out.println("Using uppercase decorator:\n  " + uppercaseDecorator.getText());
        component.setText(text);

        InversionDecorator inversionDecorator = new InversionDecorator(component);
        inversionDecorator.setText(component.getText());
        System.out.println("Using inversion decorator:\n  " + inversionDecorator.getText());
        component.setText(text);

        System.out.println("\nNow lets aggregate all decorators in a single call:");
        System.out.println("The order is:");
        System.out.println("1 - Space Between Letters Decorator");
        System.out.println("2 - Uppercase Decorator");
        System.out.println("3 - Inversion Decorator");
        SpaceBetweenLettersDecorator first = new SpaceBetweenLettersDecorator(component);
        UppercaseDecorator second = new UppercaseDecorator(first);
        InversionDecorator third = new InversionDecorator(second);
        third.setText(text);

        System.out.print("Result of a single call to the end of the text decorator stack:\n  " + third.getText());
    }
}
