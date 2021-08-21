package com.learning.gofpatterns.structural.composite;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

import java.util.List;

public class CompositeExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printCompositeBanner();

        System.out.println("==> Running Composite Example");

        /*------------------------------------------------------------------------------------
        *   Let's create a composite structure like the following:
        *   Composite Item A
        *   | Item 0 = $5
        *   | Item 1 = $10
        *   | CompositeItem B
        *   | | CompositeItem C
        *   | | | Item 2 = $2,75
        *   | | Item 3 = $ 5,90
        *   | Item 4 = $100
        *   | Item 5 = $1
        *------------------------------------------------------------------------------------*/

        System.out.println("The Composite Pattern is all about defining a hierarchy of similar elements");

        System.out.println("\nTo explain this pattern here we have a tree of items");
        System.out.println("Some of those items are LeafItems (don't have any children)");
        System.out.println("Others are CompositeItems (may or may not have children)");
        System.out.println("To use the Composite Pattern we must make both of our entities implement/extend a base entity (which here is the PricedItem)");

        System.out.println("\nCreating the tree of PricedItems...\n");
        CompositeItem compositeItemA = new CompositeItem("A");
        compositeItemA.setItems(List.of(
            new LeafItem("0", 5),
            new LeafItem("1", 10),
            new CompositeItem("B", List.of(
                new CompositeItem("C", List.of(
                        new LeafItem("2", 2.75f)
                )),
                new LeafItem("3", 5.9f)
            )),
            new LeafItem("4", 100),
            new LeafItem("5", 1)
        ));

        System.out.println("Price of whole tree:");
        System.out.printf("$%.2f\n\n", compositeItemA.getPrice());

        System.out.println("Displaying items tree:");
        compositeItemA.printItem(0);
    }
}
